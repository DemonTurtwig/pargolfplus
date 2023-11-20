package com.pgp.app.modules.courses12.ui

import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityCourses12Binding
import com.pgp.app.modules.courses12.`data`.viewmodel.Courses12VM
import kotlin.String
import kotlin.Unit

class Courses12Activity : BaseActivity<ActivityCourses12Binding>(R.layout.activity_courses_1_2) {
    private val viewModel: Courses12VM by viewModels<Courses12VM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.courses12VM = viewModel
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
        const val TAG: String = "COURSES12ACTIVITY"

    }
}
