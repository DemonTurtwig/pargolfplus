package com.pgp.app.modules.homelog.`data`.viewmodel

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.appcomponents.utility.RegisterDBHelper
import com.pgp.app.modules.homelog.`data`.model.HomelogModel
import com.pgp.app.modules.homelog.`data`.model.HomelogRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class HomelogVM(private val context: Context, private val dbHelper: RegisterDBHelper) : ViewModel(), KoinComponent{

  val homelogModel: MutableLiveData<HomelogModel> = MutableLiveData(HomelogModel())

  var navArguments: Bundle? = null


  val homelogList: MutableLiveData<MutableList<HomelogRowModel>> = MutableLiveData(mutableListOf())
  val homelogRowModels: MutableLiveData<List<HomelogRowModel>> = MutableLiveData()
  val homelogData: MutableLiveData<List<HomelogRowModel>> = MutableLiveData()


  val txtMON: MutableLiveData<String?> = MutableLiveData("MON")
  val txtTUE: MutableLiveData<String?> = MutableLiveData("TUE")
  val txtWED: MutableLiveData<String?> = MutableLiveData("WED")
  val txtTHU: MutableLiveData<String?> = MutableLiveData("THU")
  val txtFRI: MutableLiveData<String?> = MutableLiveData("FRI")

  val prevdate2: MutableLiveData<String?> = MutableLiveData("1")
  val prevdate1: MutableLiveData<String?> = MutableLiveData("2")
  val currentdate: MutableLiveData<String?> = MutableLiveData("3")
  val tomorrowdate1: MutableLiveData<String?> = MutableLiveData("4")
  val tomorrowdate2: MutableLiveData<String?> = MutableLiveData("5")

  val txtMM: MutableLiveData<String> = MutableLiveData("January")
  val txtUsername: MutableLiveData<String> = MutableLiveData("Phillip Low")

  init {
    getHomelogRowModels()

    homelogModel.value?.let { model ->
      txtMON.value = model.txtMON
      txtTUE.value = model.txtTUE
      txtWED.value = model.txtWED
      txtTHU.value = model.txtTHU
      txtFRI.value = model.txtFRI
      prevdate2.value = model.txtFour
      prevdate1.value = model.txtFive
      currentdate.value = model.txtSix
      tomorrowdate1.value = model.txtSeven
      tomorrowdate2.value = model.txtEight
      txtMM.value =
        model.txtNovember ?: "January" // Use "January" as default if txtNovember is null

      val fullName = AppPreferencesHelper.getFullName(context, dbHelper)
      txtUsername.value = fullName ?: "Phillip Low"
    }
    updateLabels()
  }


  fun getHomelogRowModels(): LiveData<List<HomelogRowModel>> {
    return homelogRowModels
  }

  fun updateLabels() {
    val dayLabels = listOf(
      "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"
    )
    val calendar = Calendar.getInstance()
    val todayIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1

    txtWED.value = dayLabels[todayIndex % 7]
    txtMON.value = dayLabels[(todayIndex + 5) % 7]
    txtTUE.value = dayLabels[(todayIndex + 6) % 7]
    txtTHU.value = dayLabels[(todayIndex + 1) % 7]
    txtFRI.value = dayLabels[(todayIndex + 2) % 7]


    val dateFormat = SimpleDateFormat("dd", Locale.getDefault())
    prevdate2.value = dateFormat.format(getOffsetDate(calendar.time, -2))
    prevdate1.value = dateFormat.format(getOffsetDate(calendar.time, -1))
    currentdate.value = dateFormat.format(calendar.time)
    tomorrowdate1.value = dateFormat.format(getOffsetDate(calendar.time, 1))
    tomorrowdate2.value = dateFormat.format(getOffsetDate(calendar.time, 2))

    // Set up the month label
    val monthFormat = SimpleDateFormat("MMM", Locale.getDefault())
    txtMM.value = monthFormat.format(calendar.time)
    val dataList = mutableListOf<HomelogRowModel>();
    homelogData.value = dataList
  }

  // Function to get a date with an offset from the current date
  private fun getOffsetDate(date: Date, offset: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time = date
    calendar.add(Calendar.DAY_OF_YEAR, offset)
    return calendar.time
  }



}
