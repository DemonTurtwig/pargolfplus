package com.pgp.app.modules.recordscore10.`data`.model

import androidx.core.content.ContextCompat
import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class RecordScore10Model(

  var txtMeadowSprings: String? =
    MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)
  ,
  var stateMalaysia: String? = MyApp.getInstance().getString(R.string.lbl_selangor),

  var txtTee2: String? = MyApp.getInstance().resources.getString(R.string.tee_blue),

  var txtCourses: String? = MyApp.getInstance().resources.getString(R.string.lbl_courses),

  var txtTee: Int? = ContextCompat.getColor(MyApp.getInstance(), R.color.blue_400),
  var txtHoleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_01),

  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole)
  ,

  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_par)
  ,

  var par: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
{
  fun updateHoleAndPar(holeNumber: String, par: String) {
    this.txtHoleOne = holeNumber
    this.par = par
  }
}
