package com.pgp.app.modules.courses11.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityCourses11Binding
import com.pgp.app.modules.courses11.data.viewmodel.Courses11VM
import kotlin.String
import kotlin.Unit

class Courses11Activity : BaseActivity<ActivityCourses11Binding>(R.layout.activity_courses_1_1) {
    private val viewModel: Courses11VM by viewModels<Courses11VM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.courses11VM = viewModel
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
        const val TAG: String = "COURSES11ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Courses11Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
