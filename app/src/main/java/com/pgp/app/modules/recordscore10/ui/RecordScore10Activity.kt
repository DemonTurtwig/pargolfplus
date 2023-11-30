package com.pgp.app.modules.recordscore10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.database.GolfCourseDao
import com.pgp.app.appcomponents.database.GolfHoleDao
import com.pgp.app.appcomponents.database.GolfHoleInfo
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.databinding.ActivityRecordScore10Binding
import com.pgp.app.modules.courses20.data.model.Courses20Model
import com.pgp.app.modules.recordscore10.data.model.RecordScore10Model
import com.pgp.app.modules.recordscore10.`data`.viewmodel.RecordScore10VM
import com.pgp.app.modules.recordscore20.ui.RecordScore20Activity
import com.pgp.app.modules.recordscore30.ui.RecordScore30Activity
import org.koin.android.ext.android.inject
import kotlin.String
import kotlin.Unit

class RecordScore10Activity :
    BaseActivity<ActivityRecordScore10Binding>(R.layout.activity_record_score_1_0) {
  private val viewModel: RecordScore10VM by viewModels<RecordScore10VM>()

  private val golfCourseDao: GolfCourseDao by inject()
  private val golfHoleDao: GolfHoleDao by inject()

  var courseId: Long? = null

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordScore10VM = viewModel

    viewModel.recordScore10Model.observe(this, { model ->
      model?.let {
        binding.valueHole10.text = it.txtHoleOne.toString()
        binding.parvalue.text = it.par.toString()
      }
    })

    viewModel.golfHoleInfo!!.observe(this, { golfHoleInfoList ->
      golfHoleInfoList!!.firstOrNull()?.let { golfHoleInfo ->
        binding.valueHole10.text = golfHoleInfo.holeNumber
        binding.parvalue.text = golfHoleInfo.par
      }
    })

    viewModel.updateRecordScore10Model(this)

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
