package com.pgp.app.modules.courses12.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityCourses12Binding
import com.pgp.app.modules.courses11.ui.Courses11Activity
import com.pgp.app.modules.courses12.`data`.model.Listtitle1RowModel
import com.pgp.app.modules.courses12.`data`.viewmodel.Courses12VM
import com.pgp.app.modules.courses20.ui.Courses20Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Courses12Activity : BaseActivity<ActivityCourses12Binding>(R.layout.activity_courses_1_2) {
  private val viewModel: Courses12VM by viewModels<Courses12VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtitleAdapter = ListtitleAdapter(viewModel.listtitleList.value?:mutableListOf())
    binding.recyclerListtitle.adapter = listtitleAdapter
    listtitleAdapter.setOnItemClickListener(
    object : ListtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listtitle1RowModel) {
        onClickRecyclerListtitle(view, position, item)
      }
    }
    )
    viewModel.listtitleList.observe(this) {
      listtitleAdapter.updateData(it)
    }
    binding.courses12VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtitle(
    view: View,
    position: Int,
    item: Listtitle1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumntitle ->  {
        val destIntent = Courses20Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "COURSES12ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Courses11Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
