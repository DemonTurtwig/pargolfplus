package com.pgp.app.modules.courses10.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String


data class ListtitleRowModel(
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf),
  var txtSelangor: String? = MyApp.getInstance().resources.getString(R.string.lbl_selangor),
  var imageResId: Int? = null,
)

