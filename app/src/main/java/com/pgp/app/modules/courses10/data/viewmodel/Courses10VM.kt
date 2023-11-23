package com.pgp.app.modules.courses10.`data`.viewmodel

import android.app.Application
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pgp.app.appcomponents.database.AppDatabase
import com.pgp.app.appcomponents.database.GolfClub
import org.koin.core.KoinComponent

class Courses10VM(application: Application) : AndroidViewModel(application), KoinComponent {

    var navArguments: Bundle? = null


    val golfClubs: LiveData<List<GolfClub>>

    init {
        // Initialize golfClubs LiveData with data from the Room database
        val database = AppDatabase.getInstance(application)
        golfClubs = database.golfClubDao().getAllGolfClubsLiveData()
    }
}
