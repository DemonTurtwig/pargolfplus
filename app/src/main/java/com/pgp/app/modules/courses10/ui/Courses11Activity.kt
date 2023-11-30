package com.pgp.app.modules.courses10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.database.GolfCourse
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.databinding.ActivityCourses11Binding
import com.pgp.app.modules.courses10.data.viewmodel.Courses11VM
import kotlinx.coroutines.launch


class Courses11Activity : BaseActivity<ActivityCourses11Binding>(R.layout.activity_courses_1_1) {
    private val viewModel: Courses11VM by viewModels<Courses11VM>()

    override fun onInitialized() {
        //...

        val golfCoursesAdapterC11 = ListtitleAdapterC11(viewModel, emptyList())
        golfCoursesAdapterC11.setOnItemClickListener(object :

            ListtitleAdapterC11.OnItemClickListener {
            override fun onItemClick(view: View, position: Int, item: GolfCourse) {
                // Log the clicked position
                Log.d("ListtitleAdapterC11", "Item clicked at position $position, title: ${item.courseName}")

                // Save the golf course data
                AppPreferencesHelper.saveGolfCourseData(view.context, item.courseName)

                // Start a coroutine to get the course ID by name
                viewModel.viewModelScope.launch {
                    // Get the course ID by name from the database
                    val courseId = viewModel.getGolfCourseIdByName(item.courseName)

                    // Save the golf course ID
                    if (courseId != null) {
                        AppPreferencesHelper.saveGolfCourseIDData(view.context, courseId)
                    }

                    // Start Courses12Activity
                    val destIntent = Courses12Activity.getIntent(view.context, null)
                    view.context.startActivity(destIntent)
                }
            }

        })
        binding.recyclerListtitle2.adapter = golfCoursesAdapterC11
        viewModel.golfCourses.observe(this, Observer { golfCourses ->
            golfCoursesAdapterC11.updateData(golfCourses)
        })
    }
    override fun setUpClicks() {
        binding.imageArrowleft.setOnClickListener {
            finish()
        }
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