package com.pgp.app.modules.intro.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.intro.`data`.model.IntroModel
import org.koin.core.KoinComponent

class IntroVM : ViewModel(), KoinComponent {
  val introModel: MutableLiveData<IntroModel> = MutableLiveData(IntroModel())

  var navArguments: Bundle? = null
}
