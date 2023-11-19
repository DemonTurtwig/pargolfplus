package com.pgp.app.modules.homelog.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class HomelogRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGlenmarieGolf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGlenmarieGolfOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)

)
