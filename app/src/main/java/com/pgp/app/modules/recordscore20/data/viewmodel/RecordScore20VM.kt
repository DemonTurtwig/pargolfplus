package com.pgp.app.modules.recordscore20.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.recordscore20.`data`.model.RecordScore20Model
import org.koin.core.KoinComponent

class RecordScore20VM : ViewModel(), KoinComponent {
  val recordScore20Model: MutableLiveData<RecordScore20Model> =
      MutableLiveData(RecordScore20Model())

  var navArguments: Bundle? = null
}
