package com.pgp.app.modules.recordscore20.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityRecordScore20Binding
import com.pgp.app.modules.recordscore10.ui.RecordScore10Activity
import com.pgp.app.modules.recordscore20.`data`.viewmodel.RecordScore20VM
import com.pgp.app.modules.recordscore30.ui.RecordScore30Activity
import kotlin.String
import kotlin.Unit

class RecordScore20Activity :
    BaseActivity<ActivityRecordScore20Binding>(R.layout.activity_record_score_2_0) {
  private val viewModel: RecordScore20VM by viewModels<RecordScore20VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordScore20VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineDrawer.setOnClickListener {
      val destIntent = RecordScore10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnScore.setOnClickListener {
      val destIntent = RecordScore30Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RECORD_SCORE20ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordScore20Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
