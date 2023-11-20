package com.pgp.app.modules.recordscore40.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.recordscore40.data.model.RecordScore40Model
import org.koin.core.KoinComponent

class RecordScore40VM : ViewModel(), KoinComponent {
    val recordScore40Model: MutableLiveData<RecordScore40Model> =
        MutableLiveData(RecordScore40Model())

    var navArguments: Bundle? = null
}
