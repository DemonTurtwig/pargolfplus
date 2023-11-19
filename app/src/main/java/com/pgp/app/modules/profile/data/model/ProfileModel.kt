package com.pgp.app.modules.profile.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleBar: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
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
