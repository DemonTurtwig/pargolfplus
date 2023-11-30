package com.pgp.app.modules.courses10.ui

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.utility.AppPreferencesHelper.saveGolfCourseData
import com.pgp.app.appcomponents.utility.AppPreferencesHelper.saveGolfTeeData
import com.pgp.app.databinding.ActivityCourses12Binding
import com.pgp.app.modules.courses10.data.viewmodel.Courses12VM
import com.pgp.app.modules.courses20.ui.Courses20Activity

class Courses12Activity : BaseActivity<ActivityCourses12Binding>(R.layout.activity_courses_1_2) {
    private val viewModel: Courses12VM by viewModels<Courses12VM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.courses12VM = viewModel
    }


    override fun setUpClicks() {
        binding.whitetee.setOnClickListener { onTeeColorClicked("White") }
        binding.bluetee.setOnClickListener { onTeeColorClicked("Blue") }
        binding.redtee.setOnClickListener { onTeeColorClicked("Red") }
    }
    private fun onTeeColorClicked(teeColor: String) {


        viewModel.onTeeColorClicked(teeColor)

        saveGolfTeeData(getApplication(), viewModel.navArguments?.getString("Tee"))

        // Navigate to Courses20Activity
        val intent = Courses20Activity.getIntent(getApplication(), viewModel.navArguments)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        getApplication().startActivity(intent)
    }

    companion object {
        const val TAG: String = "COURSES12ACTIVITY"

        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Courses12Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}