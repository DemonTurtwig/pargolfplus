package com.pgp.app.modules.homemenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.homemenu.`data`.model.HomeMenuModel
import org.koin.core.KoinComponent

class HomeMenuVM : ViewModel(), KoinComponent {
  val homeMenuModel: MutableLiveData<HomeMenuModel> = MutableLiveData(HomeMenuModel())

  var navArguments: Bundle? = null
}
