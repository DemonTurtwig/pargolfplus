package com.pgp.app.modules.resetpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.resetpassword.`data`.model.ResetpasswordModel
import org.koin.core.KoinComponent

class ResetpasswordVM : ViewModel(), KoinComponent {
  val resetpasswordModel: MutableLiveData<ResetpasswordModel> =
      MutableLiveData(ResetpasswordModel())

  var navArguments: Bundle? = null
}
