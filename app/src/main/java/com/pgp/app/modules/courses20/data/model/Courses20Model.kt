package com.pgp.app.modules.courses20.`data`.model

import androidx.core.content.ContextCompat
import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class Courses20Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeadowSprings: String? = MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf),
  var txtSelangor: String? = MyApp.getInstance().resources.getString(R.string.lbl_selangor),
  var colorTee: String? = MyApp.getInstance().resources.getString(R.string.tee_blue),
  var txtCourse: String? = MyApp.getInstance().resources.getString(R.string.lbl_courses),
  var colorTextTee: Int? = ContextCompat.getColor(MyApp.getInstance(), R.color.blue_400)
)
