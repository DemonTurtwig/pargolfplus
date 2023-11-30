package com.pgp.app.modules.courses10.data.viewmodel

import android.app.Application
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import com.pgp.app.appcomponents.utility.AppPreferencesHelper.saveGolfCourseData
import com.pgp.app.appcomponents.utility.AppPreferencesHelper.saveGolfTeeData
import com.pgp.app.modules.courses20.ui.Courses20Activity
import org.koin.core.KoinComponent

class Courses12VM(application: Application) : AndroidViewModel(application), KoinComponent {

    var navArguments: Bundle? = null

    fun onTeeColorClicked(teeColor: String) {

        saveGolfTeeData(getApplication(), teeColor)

        // Navigate to Courses20Activity
        val intent = Courses20Activity.getIntent(getApplication(), navArguments)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        getApplication<Application>().startActivity(intent)
    }

}