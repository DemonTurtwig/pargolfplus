package com.pgp.app.modules.intro.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityIntroBinding
import com.pgp.app.modules.intro.`data`.viewmodel.IntroVM
import com.pgp.app.modules.intromain.ui.IntromainActivity
import kotlin.String
import kotlin.Unit

class IntroActivity : BaseActivity<ActivityIntroBinding>(R.layout.activity_intro) {
  private val viewModel: IntroVM by viewModels<IntroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = IntromainActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.frameIntro.setOnClickListener {
        val destIntent = IntromainActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "INTRO_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, IntroActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
