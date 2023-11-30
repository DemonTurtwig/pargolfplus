package com.pgp.app.modules.courses10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityCourses10Binding
import com.pgp.app.modules.courses10.data.model.ListtitleRowModel
import com.pgp.app.modules.courses10.`data`.viewmodel.Courses10VM
import androidx.lifecycle.Observer
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Courses10Activity : BaseActivity<ActivityCourses10Binding>(R.layout.activity_courses_1_0) {
  private val viewModel: Courses10VM by viewModels<Courses10VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val golfClubsAdapter = ListtitleAdapter(viewModel, emptyList())
    binding.recyclerListtitle.adapter = golfClubsAdapter

    viewModel.golfClubs.observe(this, Observer { golfClubs ->
      // Ensure golfClubs is of type List<GolfClub>
      golfClubsAdapter.updateData(golfClubs)
    })

    binding.courses10VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListtitle(
    view: View,
    position: Int,
    item: ListtitleRowModel
  ): Unit {
    when (view.id) {
      R.id.linearColumnline -> {
        val destIntent = Courses11Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "COURSES10ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Courses10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
