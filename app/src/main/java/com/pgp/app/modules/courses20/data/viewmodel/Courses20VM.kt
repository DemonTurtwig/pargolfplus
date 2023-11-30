package com.pgp.app.modules.courses20.`data`.viewmodel

import android.content.Context
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.R
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.modules.courses20.`data`.model.Courses20Model
import org.koin.core.KoinComponent

class Courses20VM : ViewModel(), KoinComponent {
  val courses20Model: MutableLiveData<Courses20Model> = MutableLiveData(Courses20Model())

  var navArguments: Bundle? = null

  fun updateCourses20Model(context: Context) {

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


    courses20Model.value = Courses20Model(club, state, tee, course, colorTee)
  }
}
