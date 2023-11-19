package com.pgp.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.utility.SignupModule
import com.pgp.app.databinding.ActivitySignupBinding
import com.pgp.app.modules.login.ui.LoginActivity
import com.pgp.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 384
  private lateinit var signupModule: SignupModule

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    signupModule = SignupModule(
      this,
      this,
      binding.inputUsername,
      binding.fnInput,
      binding.lnInput,
      binding.pwInput,
      binding.confirmpwInput,
      binding.agreeTnC,
      binding.btnCreateAccount
    )
  }
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupVM = viewModel
  }


  override fun setUpClicks(): Unit {

    binding.btnLanguage.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
    }

  }

  companion object {
    const val TAG: String = "SIGNUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }

}
