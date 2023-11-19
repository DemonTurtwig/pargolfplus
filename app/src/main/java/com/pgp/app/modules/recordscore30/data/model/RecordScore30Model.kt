package com.pgp.app.modules.recordscore30.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class RecordScore30Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayer: String? = MyApp.getInstance().resources.getString(R.string.lbl_player)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_philip_low)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt31hcp: String? = MyApp.getInstance().resources.getString(R.string.lbl_hcp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleBar: String? = MyApp.getInstance().resources.getString(R.string.lbl_score)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_03)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStrokes: String? = MyApp.getInstance().resources.getString(R.string.lbl_strokes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowmanywerep: String? = MyApp.getInstance().resources.getString(R.string.lbl_par2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenalties: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)

)
