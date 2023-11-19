package com.pgp.app.modules.homelog.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.databinding.ActivityHomelogBinding
import com.pgp.app.modules.courses20.ui.Courses20Activity
import com.pgp.app.modules.homelog.`data`.model.HomelogRowModel
import com.pgp.app.modules.homelog.`data`.viewmodel.HomelogVM
import com.pgp.app.modules.homelog.data.viewmodel.HomelogVMFactory
import com.pgp.app.modules.homemenu.ui.HomeMenuActivity
import com.pgp.app.modules.profile.ui.ProfileActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomelogActivity : BaseActivity<ActivityHomelogBinding>(R.layout.activity_homelog) {

  private lateinit var viewModel: HomelogVM
  private val homelogAdapter = HomelogAdapter(mutableListOf())

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProvider(this, HomelogVMFactory(this)).get(HomelogVM::class.java)

    // Observe changes in the ViewModel
    viewModel.txtMON.observe(this) { value -> binding.txtMON.text = value }
    viewModel.txtTUE.observe(this) { value -> binding.txtTUE.text = value }
    viewModel.txtWED.observe(this) { value -> binding.txtWED.text = value }
    viewModel.txtTHU.observe(this) { value -> binding.txtTHU.text = value }
    viewModel.txtFRI.observe(this) { value -> binding.txtFRI.text = value }
    viewModel.prevdate2.observe(this) { value -> binding.prevdate2.text = value }
    viewModel.prevdate1.observe(this) { value -> binding.prevdate1.text = value }
    viewModel.currentdate.observe(this) { value -> binding.currentdate.text = value }
    viewModel.tomorrowdate1.observe(this) { value -> binding.tomorrowdate1.text = value }
    viewModel.tomorrowdate2.observe(this) { value -> binding.tomorrowdate2.text = value }
    viewModel.txtMM.observe(this) { value -> binding.txtMM.text = value }

    // Call the setupCalendar function
    setupCalendar()

    binding.homelogVM = viewModel
    binding.recyclerHomelog.adapter = homelogAdapter

    homelogAdapter.setOnItemClickListener(
      object : HomelogAdapter.OnItemClickListener {
        override fun onItemClick(view: View, position: Int, item: HomelogRowModel) {
          onClickRecyclerHomelog(view, position, item)
        }
      }
    )
  }

  override fun onInitialized(): Unit {

    }


  override fun setUpClicks(): Unit {
    binding.linearColumnvectorstroke.setOnClickListener {
      val destIntent = HomeMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFour.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomelog(
    view: View,
    position: Int,
    item: HomelogRowModel
  ): Unit {
    when(view.id) {
      R.id.imageImageTwo -> {
        val destIntent = Courses20Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOMELOG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomelogActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
  private fun setupCalendar() {
    val calendar = Calendar.getInstance()
    // Set up the day labels
    val dayLabels = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    binding.txtMON.text = dayLabels[calendar.get(Calendar.DAY_OF_WEEK) - 1]
    binding.txtTUE.text = dayLabels[(calendar.get(Calendar.DAY_OF_WEEK) % 7)]
    binding.txtWED.text = dayLabels[(calendar.get(Calendar.DAY_OF_WEEK) + 1) % 7]
    binding.txtTHU.text = dayLabels[(calendar.get(Calendar.DAY_OF_WEEK) + 2) % 7]
    binding.txtFRI.text = dayLabels[(calendar.get(Calendar.DAY_OF_WEEK) + 3) % 7]

    // Set up the date labels
    val dateFormat = SimpleDateFormat("dd", Locale.getDefault())
    binding.prevdate2.text = dateFormat.format(getOffsetDate(calendar.time, -2))
    binding.prevdate1.text = dateFormat.format(getOffsetDate(calendar.time, -1))
    binding.currentdate.text = dateFormat.format(calendar.time)
    binding.tomorrowdate1.text = dateFormat.format(getOffsetDate(calendar.time, 1))
    binding.tomorrowdate2.text = dateFormat.format(getOffsetDate(calendar.time, 2))

    // Set up the month label
    val monthFormat = SimpleDateFormat("MMM", Locale.getDefault())
    binding.txtMM.text = monthFormat.format(calendar.time)
  }

  private fun getOffsetDate(date: Date, offset: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time = date
    calendar.add(Calendar.DAY_OF_YEAR, offset)
    return calendar.time
  }
}
