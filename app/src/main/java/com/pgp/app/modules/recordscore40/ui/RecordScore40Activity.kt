package com.pgp.app.modules.recordscore40.ui

import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityRecordScore40Binding
import com.pgp.app.modules.homelog.ui.HomelogActivity
import com.pgp.app.modules.recordscore20.ui.RecordScore20Activity
import com.pgp.app.modules.recordscore40.data.viewmodel.RecordScore40VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecordScore40Activity :
    BaseActivity<ActivityRecordScore40Binding>(R.layout.activity_record_score_4_0) {
    private val viewModel: RecordScore40VM by viewModels<RecordScore40VM>()

    private val REQUEST_CODE_HOMELOG_ACTIVITY: Int = 381

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.recordScore40VM = viewModel
    }

    override fun setUpClicks(): Unit {
        binding.linearBottom.setOnClickListener {
            val destIntent = RecordScore20Activity.getIntent(this, null)
            startActivity(destIntent)
        }
        binding.btnSaveResults.setOnClickListener {
            val destIntent = HomelogActivity.getIntent(this, null)
            startActivityForResult(destIntent, REQUEST_CODE_HOMELOG_ACTIVITY)
        }
    }

    companion object {
        const val TAG: String = "RECORD_SCORE40ACTIVITY"

    }
}