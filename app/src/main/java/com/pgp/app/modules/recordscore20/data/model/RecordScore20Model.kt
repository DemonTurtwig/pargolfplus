package com.pgp.app.modules.recordscore20.`data`.model

import androidx.core.content.ContextCompat
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
  var txtState: String? = MyApp.getInstance().resources.getString(R.string.lbl_selangor),

  var txtTee2: String? = MyApp.getInstance().resources.getString(R.string.tee_blue),

  var txtCourses: String? = MyApp.getInstance().resources.getString(R.string.lbl_courses),

  var txtTee: Int? = ContextCompat.getColor(MyApp.getInstance(), R.color.blue_400),

  /**
   * TODO Replace with dynamic value
   */
  var txtHole: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHolenumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_01)
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

{
  fun updateHoleAndPar(holeNumber: String, par: String) {
    this.txtHolenumber = holeNumber
    this.txtParnumber = par
  }
}
