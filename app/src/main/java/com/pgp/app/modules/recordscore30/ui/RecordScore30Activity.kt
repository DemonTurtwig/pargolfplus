package com.pgp.app.modules.recordscore30.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.appcomponents.utility.RecordScore30Module
import com.pgp.app.databinding.ActivityRecordScore30Binding
import com.pgp.app.modules.recordscore20.ui.RecordScore20Activity
import com.pgp.app.modules.recordscore30.data.model.RecordScore30Model
import com.pgp.app.modules.recordscore30.`data`.viewmodel.RecordScore30VM
import com.pgp.app.modules.recordscore40.ui.RecordScore40Activity
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get
import kotlin.String
import kotlin.Unit

class RecordScore30Activity :
  BaseActivity<ActivityRecordScore30Binding>(R.layout.activity_record_score_3_0) {
  private val viewModel: RecordScore30VM by viewModels<RecordScore30VM>()
  private lateinit var recordScore30Module: RecordScore30Module
  private lateinit var appPreferencesHelper: AppPreferencesHelper

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    recordScore30Module = RecordScore30Module(this, this, viewModel, binding)
    appPreferencesHelper = get()
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordScore30VM = viewModel
    viewModel.recordScore30Model.observe(this, Observer { model ->
      binding.hcpvalueText.text = model.txtZero
      binding.valuePar10.text = model.HoleId
      binding.strokevalue1.text = model.score
      binding.parvalue1.text = model.txtPar
      binding.indexvalue.text = model.txtIndex
      binding.txtClub.text = model.txtNamePlayer
    })
  }

  override fun setUpClicks(): Unit {
    binding.linearBottom.setOnClickListener {
      val destIntent = RecordScore20Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

    // Assume btnGoToNextHoleOne and btnPlus are available in binding
    binding.btnGoToNextHoleOne.setOnClickListener {
      lifecycleScope.launch {
        recordScore30Module.saveStrokeValue()
        val holeNumber = appPreferencesHelper.getHoleNumber(this@RecordScore30Activity)
        if (holeNumber < 18) {
          recordScore30Module.nextHole()
        } else {
          val intent = Intent(this@RecordScore30Activity, RecordScore40Activity::class.java)
          this@RecordScore30Activity.startActivity(intent)
        }
      }
    }

    binding.btnPlus.setOnClickListener {
      recordScore30Module.incrementValue()
    }

    binding.btnMinus.setOnClickListener {
      recordScore30Module.decrementValue()
    }

  }

  companion object {
    fun getIntent(context: Context, data: Any?): Intent {
      val intent = Intent(context, RecordScore30Activity::class.java)
      return intent
    }
  }
}
