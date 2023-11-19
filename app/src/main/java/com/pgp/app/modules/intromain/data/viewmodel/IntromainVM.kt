package com.pgp.app.modules.intromain.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.intromain.`data`.model.IntromainModel
import org.koin.core.KoinComponent

class IntromainVM : ViewModel(), KoinComponent {
  val intromainModel: MutableLiveData<IntromainModel> = MutableLiveData(IntromainModel())

  var navArguments: Bundle? = null
}
