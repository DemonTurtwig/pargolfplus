package com.pgp.app.modules.courses10.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class Courses10Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtCourses: String? = MyApp.getInstance().resources.getString(R.string.lbl_courses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindaplaceto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_a_place_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextlabel: String? = MyApp.getInstance().resources.getString(R.string.msg_type_to_search)

)
