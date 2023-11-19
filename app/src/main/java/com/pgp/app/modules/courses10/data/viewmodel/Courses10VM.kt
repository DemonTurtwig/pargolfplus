package com.pgp.app.modules.courses10.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.courses10.`data`.model.Courses10Model
import com.pgp.app.modules.courses10.`data`.model.ListtitleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Courses10VM : ViewModel(), KoinComponent {
  val courses10Model: MutableLiveData<Courses10Model> = MutableLiveData(Courses10Model())

  var navArguments: Bundle? = null

  val listtitleList: MutableLiveData<MutableList<ListtitleRowModel>> =
      MutableLiveData(mutableListOf())
}
