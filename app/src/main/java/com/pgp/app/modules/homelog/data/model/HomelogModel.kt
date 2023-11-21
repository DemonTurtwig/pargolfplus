package com.pgp.app.modules.homelog.`data`.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class HomelogModel(
  var txtHi: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi),
  var txtPhillipLow: String? = "Phillip Low",
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_00),
  var txt31hcp: String? = MyApp.getInstance().resources.getString(R.string.lbl_hcp),
  var txtNovember: String? = "January",
  var txtMON: String? = "MON",
  var txtFour: String? = "4",
  var txtTUE: String? = "TUE",
  var txtFive: String? = "5",
  var txtWED: String? = "WED",
  var txtSix: String? = "6",
  var txtTHU: String? = "THU",
  var txtSeven: String? = "7",
  var txtFRI: String? = "FRI",
  var txtEight: String? = "8",
  var txtCourses: String? = MyApp.getInstance().resources.getString(R.string.lbl_courses),
  var txtTextlabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all),
  var txtBukitKemuning: String? =
    MyApp.getInstance().resources.getString(R.string.msg_bukit_kemuning),
  var txtBukitKemuningOne: String? =
    MyApp.getInstance().resources.getString(R.string.msg_bukit_kemuning),
  var txtOther: String? = MyApp.getInstance().resources.getString(R.string.lbl_other),
  var txtOtherOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_other),
  var txtStartANewRou: String? =
    MyApp.getInstance().resources.getString(R.string.msg_start_a_new_rou),
  var txtReady: String? = MyApp.getInstance().resources.getString(R.string.lbl_ready),
  var txtPlayingHistory: String? =
    MyApp.getInstance().resources.getString(R.string.lbl_playing_history),
  var txtReadyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ready),
  var txtCheckYourStat: String? =
    MyApp.getInstance().resources.getString(R.string.msg_check_your_stat),
  var txtCheckYourStatOne: String? =
    MyApp.getInstance().resources.getString(R.string.msg_check_your_stat),
  var txtReadyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ready)
)
