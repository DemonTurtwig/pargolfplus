package com.pgp.app.modules.recordscore20.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class RecordScore20Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeadowSprings: String? =
      MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFrancisco: String? = MyApp.getInstance().resources.getString(R.string.msg_petaling_jaya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHolenumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_03)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPar: String? = MyApp.getInstance().resources.getString(R.string.lbl_par)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
