package com.pgp.app.modules.recordscore30.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityRecordScore30Binding
import com.pgp.app.modules.recordscore20.ui.RecordScore20Activity
import com.pgp.app.modules.recordscore30.`data`.viewmodel.RecordScore30VM
import kotlin.String
import kotlin.Unit

class RecordScore30Activity :
    BaseActivity<ActivityRecordScore30Binding>(R.layout.activity_record_score_3_0) {
  private val viewModel: RecordScore30VM by viewModels<RecordScore30VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordScore30VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBottom.setOnClickListener {
      val destIntent = RecordScore20Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RECORD_SCORE30ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordScore30Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
