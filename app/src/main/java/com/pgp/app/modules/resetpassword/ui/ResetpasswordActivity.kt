package com.pgp.app.modules.resetpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.utility.RegisterDBHelper
import com.pgp.app.databinding.ActivityResetpasswordBinding
import com.pgp.app.modules.login.ui.LoginActivity
import com.pgp.app.modules.resetpassword.`data`.viewmodel.ResetpasswordVM
import kotlin.String
import kotlin.Unit

class ResetpasswordActivity :
    BaseActivity<ActivityResetpasswordBinding>(R.layout.activity_resetpassword) {
  private val viewModel: ResetpasswordVM by viewModels<ResetpasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resetpasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val dbHelper = RegisterDBHelper(this)

    binding.btnResetPassword.setOnClickListener {
      val newPassword = viewModel.resetpasswordModel.value?.etInputTextRiValue
      val confirmPassword = viewModel.resetpasswordModel.value?.etInputTextRiOneValue

      if (newPassword == confirmPassword) {
        // TODO: Get the username of the user who is resetting the password.
        // In this example, we assume the username is stored in a variable named `username`.
        val username = "some_username"
        dbHelper.updatePassword(username, newPassword)

        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      } else {
        // TODO: Show an error message to the user.
      }
    }
  }

  companion object {
    const val TAG: String = "RESETPASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResetpasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
