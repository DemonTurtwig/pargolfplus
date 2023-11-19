package com.pgp.app.modules.resetpassword.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class ResetpasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleBar: String? = MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateusername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreatepassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmpasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_login3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextOnlyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextRiValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextRiOneValue: String? = null
)
