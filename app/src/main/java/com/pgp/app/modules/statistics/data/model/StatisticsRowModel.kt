package com.pgp.app.modules.statistics.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHCP: String? = MyApp.getInstance().resources.getString(R.string.lbl_hcp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAverage: String? = MyApp.getInstance().resources.getString(R.string.lbl_average)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJun: String? = MyApp.getInstance().resources.getString(R.string.lbl_jun)

)
