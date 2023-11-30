package com.pgp.app.modules.courses10.data.viewmodel

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.pgp.app.appcomponents.database.AppDatabase
import com.pgp.app.appcomponents.database.GolfCourse
import com.pgp.app.appcomponents.database.GolfCourseDao
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class Courses11VM(application: Application) : AndroidViewModel(application), KoinComponent {

    private val golfCourseDao: GolfCourseDao by lazy {
        AppDatabase.getInstance(application).golfCourseDao()
    }
    var navArguments: Bundle? = null

    val golfCourses: LiveData<List<GolfCourse>>

    suspend fun getGolfCourseIdByName(courseName: String): Long? {
        return withContext(Dispatchers.IO) {
            golfCourseDao.getCourseIdByName(courseName)
        }
    }

    init {
        // Initialize golfClubs LiveData with data from the Room database
        val clubId = AppPreferencesHelper.getSharedPreferences(application).getLong(AppPreferencesHelper.ClubId, 0)
        Log.d("Courses11VM", "clubId: $clubId")
        val courseId = AppPreferencesHelper.getSharedPreferences(application).getLong(AppPreferencesHelper.Courseid, 0)
        Log.d("Courses11VM", "courseId: $courseId")
        val database = AppDatabase.getInstance(application)

        golfCourses = database.golfCourseDao().getGolfCoursesByClubId(clubId)

    }
}
