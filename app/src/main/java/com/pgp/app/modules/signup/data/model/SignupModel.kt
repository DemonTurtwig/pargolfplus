package com.pgp.app.modules.signup.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateusername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstname: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastname: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreatepassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_password)
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
  var txtBycreatingan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_creating_a_n)
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
  var etInputTextOnlyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextOnlyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextOnlyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextRiValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextRiOneValue: String? = null
)
