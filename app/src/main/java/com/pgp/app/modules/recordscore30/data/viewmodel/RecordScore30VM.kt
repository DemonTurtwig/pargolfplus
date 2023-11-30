package com.pgp.app.modules.recordscore30.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.recordscore30.`data`.model.RecordScore30Model
import org.koin.core.KoinComponent

class RecordScore30VM : ViewModel(), KoinComponent {
    val recordScore30Model: MutableLiveData<RecordScore30Model> = MutableLiveData(RecordScore30Model())
    var navArguments: Bundle? = null
}

