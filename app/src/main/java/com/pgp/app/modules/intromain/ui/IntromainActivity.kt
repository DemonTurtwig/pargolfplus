package com.pgp.app.modules.intromain.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityIntromainBinding
import com.pgp.app.modules.intro.ui.IntroActivity
import com.pgp.app.modules.intromain.`data`.viewmodel.IntromainVM
import com.pgp.app.modules.login.ui.LoginActivity
import com.pgp.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

class IntromainActivity : BaseActivity<ActivityIntromainBinding>(R.layout.activity_intromain) {
  private val viewModel: IntromainVM by viewModels<IntromainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.intromainVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtDescription.setOnClickListener {
      val destIntent = IntroActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignUp.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogIn.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INTROMAIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntromainActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
