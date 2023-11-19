package com.pgp.app.modules.history.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleBar: String? = MyApp.getInstance().resources.getString(R.string.lbl_playing_history)

)
