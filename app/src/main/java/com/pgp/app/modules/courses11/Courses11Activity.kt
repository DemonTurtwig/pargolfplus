package com.pgp.app.modules.courses11.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityCourses11Binding
import com.pgp.app.modules.courses11.`data`.model.Listtitle2RowModel
import com.pgp.app.modules.courses11.`data`.viewmodel.Courses11VM
import com.pgp.app.modules.courses12.ui.Courses12Activity
import com.pgp.app.modules.courses20.ui.Courses20Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Courses11Activity : BaseActivity<ActivityCourses11Binding>(R.layout.activity_courses_1_1) {
  private val viewModel: Courses11VM by viewModels<Courses11VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtitleAdapter = ListtitleAdapter(viewModel.listtitleList.value?:mutableListOf())
    binding.recyclerListtitle.adapter = listtitleAdapter
    listtitleAdapter.setOnItemClickListener(
    object : ListtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listtitle2RowModel) {
        onClickRecyclerListtitle(view, position, item)
      }
    }
    )
    viewModel.listtitleList.observe(this) {
      listtitleAdapter.updateData(it)
    }
    binding.courses11VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtitle(
    view: View,
    position: Int,
    item: Listtitle2RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumntitle -> {
        val destIntent = Courses12Activity.getIntent(this, null)
        startActivity(destIntent)
      }
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
