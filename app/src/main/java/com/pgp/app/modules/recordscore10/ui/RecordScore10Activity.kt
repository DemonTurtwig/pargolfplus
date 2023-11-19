package com.pgp.app.modules.recordscore10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityRecordScore10Binding
import com.pgp.app.modules.recordscore10.`data`.viewmodel.RecordScore10VM
import com.pgp.app.modules.recordscore20.ui.RecordScore20Activity
import com.pgp.app.modules.recordscore30.ui.RecordScore30Activity
import kotlin.String
import kotlin.Unit

class RecordScore10Activity :
    BaseActivity<ActivityRecordScore10Binding>(R.layout.activity_record_score_1_0) {
  private val viewModel: RecordScore10VM by viewModels<RecordScore10VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordScore10VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineDrawer.setOnClickListener {
      val destIntent = RecordScore20Activity.getIntent(this, null)
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
    const val TAG: String = "RECORD_SCORE10ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordScore10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
