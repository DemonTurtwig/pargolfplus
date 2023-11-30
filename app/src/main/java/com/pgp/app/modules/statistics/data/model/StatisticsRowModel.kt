package com.pgp.app.modules.statistics.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_january_23_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_106)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStableford: String? = MyApp.getInstance().resources.getString(R.string.lbl_stroke_play)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBadgeBadgeWit: String? = MyApp.getInstance().resources.getString(R.string.lbl_38)

)
