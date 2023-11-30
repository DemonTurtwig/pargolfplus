package com.pgp.app.modules.courses20.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityCourses20Binding
import com.pgp.app.modules.courses20.`data`.viewmodel.Courses20VM
import com.pgp.app.modules.recordscore10.ui.RecordScore10Activity
import kotlin.String
import kotlin.Unit

class Courses20Activity : BaseActivity<ActivityCourses20Binding>(R.layout.activity_courses_2_0) {
  private val viewModel: Courses20VM by viewModels<Courses20VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.courses20VM = viewModel
    viewModel.updateCourses20Model(this)
  }

  override fun setUpClicks(): Unit {
    binding.btnStartRound.setOnClickListener {
      val destIntent = RecordScore10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COURSES20ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Courses20Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
