package com.pgp.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.di.MyApp
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.appcomponents.utility.RegisterDBHelper
import com.pgp.app.appcomponents.views.ImagePickerFragmentDialog
import com.pgp.app.databinding.ActivityProfileBinding
import com.pgp.app.modules.homelog.ui.HomelogActivity
import com.pgp.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel

    // 전체 이름(full name) 설정
    val dbHelper = RegisterDBHelper(this)  // RegisterDBHelper 인스턴스를 어떻게 생성하는지 확인해야 합니다.
    val fullName = AppPreferencesHelper.getFullName(MyApp.getInstance().applicationContext, dbHelper)
    val profileModel = viewModel.profileModel.value
    profileModel?.txtFullname = fullName
    viewModel.profileModel.postValue(profileModel)
  }

  override fun setUpClicks(): Unit {
    binding.btnChangePhoto.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager) { path ->
        // TODO: 데이터 처리
      }
    }

    binding.btnSaveChanges.setOnClickListener {
      val destIntent = HomelogActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}