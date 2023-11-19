package com.pgp.app.modules.recordscore10.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.recordscore10.`data`.model.RecordScore10Model
import org.koin.core.KoinComponent

class RecordScore10VM : ViewModel(), KoinComponent {
  val recordScore10Model: MutableLiveData<RecordScore10Model> =
      MutableLiveData(RecordScore10Model())

  var navArguments: Bundle? = null
}
