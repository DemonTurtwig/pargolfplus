package com.pgp.app.modules.courses20.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.courses20.`data`.model.Courses20Model
import org.koin.core.KoinComponent

class Courses20VM : ViewModel(), KoinComponent {
  val courses20Model: MutableLiveData<Courses20Model> = MutableLiveData(Courses20Model())

  var navArguments: Bundle? = null
}
