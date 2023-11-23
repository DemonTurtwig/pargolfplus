package com.pgp.app.modules.courses12.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.courses12.`data`.model.Courses12Model
import com.pgp.app.modules.courses12.`data`.model.Listtitle1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Courses12VM : ViewModel(), KoinComponent {
  val courses12Model: MutableLiveData<Courses12Model> = MutableLiveData(Courses12Model())

  var navArguments: Bundle? = null

  val listtitleList: MutableLiveData<MutableList<Listtitle1RowModel>> =
      MutableLiveData(mutableListOf())
}
