package com.pgp.app.modules.courses12.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class Courses12Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleBar: String? = MyApp.getInstance().resources.getString(R.string.msg_please_select_a)

)
