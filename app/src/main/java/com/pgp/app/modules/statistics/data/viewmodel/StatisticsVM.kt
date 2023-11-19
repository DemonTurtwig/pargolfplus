package com.pgp.app.modules.statistics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.modules.statistics.`data`.model.StatisticsModel
import com.pgp.app.modules.statistics.`data`.model.StatisticsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StatisticsVM : ViewModel(), KoinComponent {
  val statisticsModel: MutableLiveData<StatisticsModel> = MutableLiveData(StatisticsModel())

  var navArguments: Bundle? = null

  val statisticsList: MutableLiveData<MutableList<StatisticsRowModel>> =
      MutableLiveData(mutableListOf())
}
