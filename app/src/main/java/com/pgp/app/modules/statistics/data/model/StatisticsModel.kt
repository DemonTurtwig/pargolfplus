package com.pgp.app.modules.statistics.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistictrack: String? =
      MyApp.getInstance().resources.getString(R.string.msg_statistic_track)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandicapHistor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_handicap_histor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandicap: String? = MyApp.getInstance().resources.getString(R.string.lbl_handicap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_39)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHighest: String? = MyApp.getInstance().resources.getString(R.string.lbl_highest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLowest: String? = MyApp.getInstance().resources.getString(R.string.lbl_lowest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScoring: String? = MyApp.getInstance().resources.getString(R.string.lbl_scoring)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHCPThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_hcp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAveragetoday: String? = MyApp.getInstance().resources.getString(R.string.lbl_average_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThatsalot: String? = MyApp.getInstance().resources.getString(R.string.lbl_that_s_a_lot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt8063: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_63)

)
