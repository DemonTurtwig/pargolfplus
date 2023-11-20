package com.pgp.app.modules.courses11.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.courses11.data.model.Courses11Model
import org.koin.core.KoinComponent

class Courses11VM : ViewModel(), KoinComponent {
    val courses11Model: MutableLiveData<Courses11Model> = MutableLiveData(Courses11Model())

    var navArguments: Bundle? = null
}