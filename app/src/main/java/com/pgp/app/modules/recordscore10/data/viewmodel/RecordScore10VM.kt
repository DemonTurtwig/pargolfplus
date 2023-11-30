package com.pgp.app.modules.recordscore10.`data`.viewmodel

import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pgp.app.R
import com.pgp.app.appcomponents.database.AppDatabase
import com.pgp.app.appcomponents.database.GolfCourseDao
import com.pgp.app.appcomponents.database.GolfHoleDao
import com.pgp.app.appcomponents.database.GolfHoleInfo
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.modules.recordscore10.`data`.model.RecordScore10Model
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class RecordScore10VM(application: Application) : AndroidViewModel(application), KoinComponent{
    val golfCourseDao: GolfCourseDao
    val golfHoleDao: GolfHoleDao

    init {
        // Get instances of golfCourseDao and golfHoleDao from the Room database
        val database = AppDatabase.getInstance(application)
        golfCourseDao = database.golfCourseDao()
        golfHoleDao = database.golfHoleDao()
    }

    val golfHoleInfo: LiveData<List<GolfHoleInfo?>?>? = golfHoleDao.golfHoleInfo
    var courseId: Long? = null
    val recordScore10Model: MutableLiveData<RecordScore10Model> =
        MutableLiveData(RecordScore10Model())

    var navArguments: Bundle? = null
    init {
        golfHoleInfo!!.observeForever { infoList ->
            infoList!!.firstOrNull()?.let { info ->
                recordScore10Model.value?.updateHoleAndPar(info.holeNumber.toString(), info.par.toString())
            }
        }
    }
    fun updateRecordScore10Model(context: Context) {

        val sharedPreferences = AppPreferencesHelper.getSharedPreferences(context)
        val defTee = sharedPreferences.getString(AppPreferencesHelper.TeeTee, "")
        val club = sharedPreferences.getString(AppPreferencesHelper.Club, "")
        val state = sharedPreferences.getString(AppPreferencesHelper.Malaysiastate, "")
        val course = sharedPreferences.getString(AppPreferencesHelper.Course, "")

        val tee = when (defTee) {
            "white_tee" -> "White"
            "red_tee" -> "Red"
            "blue_tee" -> "Blue"
            else -> {"Error. Could not get Tee Color"}
        }

        val colorTee = when (tee) {
            "Red" -> ContextCompat.getColor(context, R.color.red_401)
            "Blue" -> ContextCompat.getColor(context, R.color.blue_400)
            "White" -> ContextCompat.getColor(context, R.color.white)
            else -> ContextCompat.getColor(context, R.color.white) // Default color
        }

        viewModelScope.launch(Dispatchers.IO) {
            courseId = course?.let { golfCourseDao.getCourseIdByName(it) }
            recordScore10Model.postValue(RecordScore10Model(club, state, tee, course, colorTee))
        }

        recordScore10Model.value = RecordScore10Model(club, state, tee, course, colorTee)
    }

}

