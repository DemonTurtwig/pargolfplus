package com.pgp.app.modules.recordscore20.ui

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.databinding.ActivityRecordScore20Binding
import com.pgp.app.modules.recordscore10.ui.RecordScore10Activity
import com.pgp.app.modules.recordscore20.`data`.viewmodel.RecordScore20VM
import com.pgp.app.modules.recordscore30.ui.RecordScore30Activity
import kotlin.String
import kotlin.Unit

class RecordScore20Activity :
    BaseActivity<ActivityRecordScore20Binding>(R.layout.activity_record_score_2_0) {
  private val viewModel: RecordScore20VM by viewModels<RecordScore20VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recordScore20VM = viewModel


    viewModel.recordScore20Model.observe(this, { model ->
      model?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
    })

    viewModel.golfHoleInfo!!.observe(this, { golfHoleInfoList ->
      golfHoleInfoList!!.firstOrNull()?.let { golfHoleInfo ->
        binding.txtHolenumber.text = golfHoleInfo.holeNumber
        binding.txtParnumber.text = golfHoleInfo.par
      }

    })
    viewModel.updateRecordScore20Model(this)
    viewModel.holesCompletionStatus.observe(this, { statusList ->
      // Update the icons
        for (i in statusList.indices) {
          val button = when(i) {
            0 -> binding.btn01
            1 -> binding.btn02
            2 -> binding.btn03
            3 -> binding.btn04
            4 -> binding.btn05
            5 -> binding.btn06
            6 -> binding.btn07
            7 -> binding.btn08
            8 -> binding.btn09
            9 -> binding.btn10
            10 -> binding.btn11
            11 -> binding.btn12
            12 -> binding.btn13
            13 -> binding.btn14
            14 -> binding.btn15
            15 -> binding.btn16
            16 -> binding.btn17
            17 -> binding.btn18
            else -> null
          }
          button?.let {
          }
        }

        for (i in statusList.indices) {
          val imageView = when (i) {
            0 -> binding.cm01
            1 -> binding.cm02
            2 -> binding.cm03
            3 -> binding.cm04
            4 -> binding.cm05
            5 -> binding.cm06
            6 -> binding.cm07
            7 -> binding.cm08
            8 -> binding.cm09
            9 -> binding.cm10
            10 -> binding.cm11
            11 -> binding.cm12
            12 -> binding.cm13
            13 -> binding.cm14
            14 -> binding.cm15
            15 -> binding.cm16
            16 -> binding.cm17
            17 -> binding.cm18
            else -> null
          }
          imageView?.let {
            val icon =
              if (statusList[i]) R.drawable.img_checkmark_red_a100 else R.drawable.img_checkmark_gray_501
            it.setImageResource(icon)
          }

        }

      // Update btnFinishRound
      val isAllComplete = statusList.all { it }
      if (isAllComplete) {
        binding.btnFinishRound.setBackgroundResource(R.color.red_A100)
        binding.btnFinishRound.isEnabled = true
      } else {
        binding.btnFinishRound.setTextColor(Color.rgb(198,199,200))
        binding.btnFinishRound.setBackgroundResource(R.color.bluegray_50)
        binding.btnFinishRound.isEnabled = false
      }
    })
    val hole01Button = binding.btn01 //
    hole01Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "1" }
      if (holeInfo != null) {
        // Calls updateHoleAndPar if Hole "1" exists
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole01Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      ) // Change background colour to red_a100
      hole01Button.setTextColor(ContextCompat.getColor(this, R.color.white)) // change text to white
    }
    val hole02Button = binding.btn02
    hole02Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "2" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole02Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole02Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole03Button = binding.btn03 //
    hole03Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "3" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole03Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole03Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole04Button = binding.btn04
    hole04Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "4" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole04Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole04Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    val hole05Button = binding.btn05
    hole05Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "5" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }

      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
        hole05Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
        hole05Button.setTextColor(ContextCompat.getColor(this, R.color.white))
      }
    }



    val hole06Button = binding.btn06
    hole06Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "6" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole06Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole06Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }


    val hole07Button = binding.btn07
    hole07Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "7" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole07Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole07Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    val hole08Button = binding.btn08
    hole08Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "8" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole08Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole08Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole09Button = binding.btn09
    hole09Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "9" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole09Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole09Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole10Button = binding.btn10
    hole10Button.setOnClickListener {
      val holeInfo = viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "10" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
        viewModel.recordScore20Model.value?.let {
          binding.txtHolenumber.text = it.txtHolenumber.toString()
          binding.txtParnumber.text = it.txtParnumber.toString()
        }
      }
      hole10Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole10Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole11Button = binding.btn11
    hole11Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "11" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole11Button.setBackgroundColor(ContextCompat.getColor(this, R.color.red_A100))
      hole11Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    val hole12Button = binding.btn12
    hole12Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "12" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole12Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole12Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole13Button = binding.btn13
    hole13Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "13" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole13Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole13Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole14Button = binding.btn14
    hole14Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "14" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole14Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole14Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
    val hole15Button = binding.btn15
    hole15Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "15" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole15Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole15Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    val hole16Button = binding.btn16
    hole16Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "16" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole16Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole16Button.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    val hole17Button = binding.btn17
    hole17Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "17" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole17Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole17Button.setTextColor(
        ContextCompat.getColor(
          this,
          R.color.white
        )
      )
    }

    val hole18Button = binding.btn18
    hole18Button.setOnClickListener {
      val holeInfo =
        viewModel.golfHoleInfo!!.value?.firstOrNull { it!!.holeNumber == "18" }
      if (holeInfo != null) {
        viewModel.recordScore20Model.value?.updateHoleAndPar(
          holeInfo.holeNumber.toString(),
          holeInfo.par.toString()
        )
      }
      viewModel.recordScore20Model.value?.let {
        binding.txtHolenumber.text = it.txtHolenumber.toString()
        binding.txtParnumber.text = it.txtParnumber.toString()
      }
      hole18Button.setBackgroundColor(
        ContextCompat.getColor(
          this,
          R.color.red_A100
        )
      )
      hole18Button.setTextColor(
        ContextCompat.getColor(
          this,
          R.color.white
        )
      )
    }
  }
  override fun setUpClicks(): Unit {
    binding.lineDrawer.setOnClickListener {
      val destIntent = RecordScore10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnScore.setOnClickListener {

        // Save the current hole number before transitioning to the next activity
        val holeNumber = binding.txtHolenumber.text.toString().toIntOrNull()
        holeNumber?.let { AppPreferencesHelper.saveHoleNumber(this, it) }

        val destIntent = RecordScore30Activity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }


  companion object {
    const val TAG: String = "RECORD_SCORE20ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecordScore20Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
