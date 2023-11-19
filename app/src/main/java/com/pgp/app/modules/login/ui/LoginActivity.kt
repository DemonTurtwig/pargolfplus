package com.pgp.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityLoginBinding
import com.pgp.app.modules.homelog.ui.HomelogActivity
import com.pgp.app.modules.login.`data`.viewmodel.LoginVM
import com.pgp.app.modules.resetpassword.ui.ResetpasswordActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_RESETPASSWORD_ACTIVITY: Int = 590

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = HomelogActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnForgotpw.setOnClickListener {
      val destIntent = ResetpasswordActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_RESETPASSWORD_ACTIVITY)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
