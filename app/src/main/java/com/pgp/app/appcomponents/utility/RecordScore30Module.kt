package com.pgp.app.appcomponents.utility

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.lifecycle.Observer
import com.pgp.app.R
import com.pgp.app.appcomponents.database.AppDatabase
import com.pgp.app.appcomponents.database.GolfHoleDao
import com.pgp.app.appcomponents.database.HoleStrokes
import com.pgp.app.appcomponents.database.StrokesDao
import com.pgp.app.databinding.ActivityRecordScore30Binding
import com.pgp.app.modules.recordscore30.data.model.RecordScore30Model
import com.pgp.app.modules.recordscore30.data.viewmodel.RecordScore30VM
import com.pgp.app.modules.recordscore30.ui.RecordScore30Activity
import com.pgp.app.modules.recordscore40.ui.RecordScore40Activity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Integer.max

class RecordScore30Module(
    private val context: Context,
    private val activity: RecordScore30Activity,
    private val viewModel: RecordScore30VM,
    private val binding: ActivityRecordScore30Binding
) {
    private val appPreferencesHelper = AppPreferencesHelper
    private val golfHoleDao: GolfHoleDao
    private val strokesDao: StrokesDao
    val dbHelper = RegisterDBHelper(context)

    init {
        val database = AppDatabase.getInstance(context)
        strokesDao = database.strokesDao()
        golfHoleDao = database.golfHoleDao()

        // Initialize RecordScore30Model
        viewModel.recordScore30Model.value = RecordScore30Model()
        updatePlayerName()
        loadGolfHoleData()
        updateParValue()
        updateHCPValue()
        updateIndexAndParValue()
    }

    private fun updatePlayerName() {
        val username = appPreferencesHelper.getFullName(context, dbHelper);
        viewModel.recordScore30Model.value?.txtNamePlayer = username
    }

    private fun loadGolfHoleData() {
        val golfHolesLiveData = golfHoleDao.allGolfHolesLiveData
        // Use golfHolesLiveData here
    }

    private fun updateParValue() {
        val holeNumber = appPreferencesHelper.getHoleNumber(context)
        val currentModel = viewModel.recordScore30Model.value?.apply {
            HoleId = holeNumber.toString()
        }
        viewModel.recordScore30Model.postValue(currentModel)
    }

    private fun updateHCPValue() {
        // Assume HCP data is available in viewModel
        //viewModel.recordScore30Model.value?.txt31hcp = viewModel.txt31hcp.toString()
    }

    private fun updateIndexAndParValue() {
        val courseId = appPreferencesHelper.getSavedCourseId(context)
        Log.d("RecordScore30Module", "courseId: $courseId")  // Log line
        val holeNumber = appPreferencesHelper.getHoleNumber(context)
        val golfHoleInfo = golfHoleDao.getGolfHoles2(courseId.toString())

        golfHoleInfo!!.observe(activity, Observer { golfHoles ->
            if (golfHoles != null) {
                val golfHole = golfHoles.find { it!!.holeNumber == holeNumber.toString() }
                golfHole?.let {
                    val currentModel = viewModel.recordScore30Model.value?.apply {
                        // Add this line to update HoleId with the holeNumber
                        HoleId = it.holeNumber
                        txtIndex = it.indexNumber.toString()
                        txtPar = it.par.toString()
                    }
                    viewModel.recordScore30Model.postValue(currentModel)
                }
            }
        })
    }

    suspend fun saveStrokeValue() {
        val savedHole = viewModel.recordScore30Model.value?.HoleId
        val strokes = viewModel.recordScore30Model.value?.score
        Log.d("RecordScore30Module", "Saved Hole: $savedHole, Strokes: $strokes")

        val existingStroke = savedHole?.let { strokesDao.getStrokes(it).firstOrNull() }
        if (existingStroke != null) {
            // If a Stroke for the Hole already exists, update it
            existingStroke.strokes = strokes
            strokesDao.updateStrokes(existingStroke)
        } else {
            // If no Stroke for the Hole exists yet, create a new one
            strokesDao.saveStrokes(HoleStrokes(null, strokes, savedHole))
        }
    }

    fun nextHole() {
        CoroutineScope(Dispatchers.Main).launch {
            val holeNumber = appPreferencesHelper.getHoleNumber(context)

            if (holeNumber < 18) {
                saveStrokeValue()  // Save the current hole's strokes before moving to the next hole
                appPreferencesHelper.saveHoleNumber(context, holeNumber + 1)
                updateParValue()
                updateIndexAndParValue()
                binding.btnGoToNextHoleOne.text = context.getString(R.string.lbl_go_to_next_hole)
                binding.btnGoToNextHoleOne.setOnClickListener {
                    // Call nextHole() recursively
                    nextHole()
                }
            } else {
                saveStrokeValue()  // Save the last hole's strokes before finishing the round
                binding.btnGoToNextHoleOne.text = context.getString(R.string.lbl_finish_round)
                binding.btnGoToNextHoleOne.setOnClickListener {
                    val intent = Intent(context, RecordScore40Activity::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }

    fun incrementValue() {
        viewModel.recordScore30Model.value?.score?.let { score ->
            val scoreInt = score.toIntOrNull() ?: 0
            viewModel.recordScore30Model.value = viewModel.recordScore30Model.value?.apply {
                this.score = (scoreInt + 1).toString()
            }
        }
    }

    fun decrementValue() {
        viewModel.recordScore30Model.value?.score?.let { score ->
            val scoreInt = score.toIntOrNull() ?: 0
            viewModel.recordScore30Model.value = viewModel.recordScore30Model.value?.apply {
                this.score = max(1, scoreInt - 1).toString()
            }
        }
    }
}