package com.pgp.app.modules.homemenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityHomeMenuBinding
import com.pgp.app.modules.courses10.ui.Courses10Activity
import com.pgp.app.modules.courses20.ui.Courses20Activity
import com.pgp.app.modules.homelog.ui.HomelogActivity
import com.pgp.app.modules.homemenu.`data`.viewmodel.HomeMenuVM
import com.pgp.app.modules.intromain.ui.IntromainActivity
import com.pgp.app.modules.profile.ui.ProfileActivity
import com.pgp.app.modules.statistics.ui.StatisticsActivity
import kotlin.String
import kotlin.Unit

class HomeMenuActivity : BaseActivity<ActivityHomeMenuBinding>(R.layout.activity_home_menu) {
  private val viewModel: HomeMenuVM by viewModels<HomeMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCheckmark.setOnClickListener {
      val destIntent = Courses10Activity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.linearLogout.setOnClickListener {
      val destIntent = IntromainActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcheckmark.setOnClickListener {
      val destIntent = Courses10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etThree.setOnClickListener {
      val destIntent = StatisticsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
