package com.pgp.app.modules.courses20.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class Courses20Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeadowSprings: String? =
      MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelangor: String? = MyApp.getInstance().resources.getString(R.string.lbl_selangor)

)
