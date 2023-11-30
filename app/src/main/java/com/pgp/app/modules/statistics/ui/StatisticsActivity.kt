package com.pgp.app.modules.statistics.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityStatisticsBinding
import com.pgp.app.modules.profile.ui.ProfileActivity
import com.pgp.app.modules.statistics.`data`.model.StatisticsRowModel
import com.pgp.app.modules.statistics.`data`.viewmodel.StatisticsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StatisticsActivity : BaseActivity<ActivityStatisticsBinding>(R.layout.activity_statistics) {
  private val viewModel: StatisticsVM by viewModels<StatisticsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val statisticsAdapter = StatisticsAdapter(viewModel.statisticsList.value?:mutableListOf())
    binding.linearColumnthirty.adapter = statisticsAdapter
    statisticsAdapter.setOnItemClickListener(
    object : StatisticsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StatisticsRowModel) {
        onClickRecyclerStatistics(view, position, item)
      }
    }
    )
    viewModel.statisticsList.observe(this) {
      statisticsAdapter.updateData(it)
    }
    binding.statisticsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageRectangleEighteen.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStatistics(
    view: View,
    position: Int,
    item: StatisticsRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnthirty ->  {
        onClickRecyclerStatisticsLinearColumnthirty(view, position, item)
      }
    }
  }

  fun onClickRecyclerStatisticsLinearColumnthirty(
    view: View,
    position: Int,
    item: StatisticsRowModel
  ) {

  }

  companion object {
    const val TAG: String = "STATISTICS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StatisticsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
