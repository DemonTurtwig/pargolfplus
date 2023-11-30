package com.pgp.app.modules.recordscore40.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import com.pgp.app.R
import com.pgp.app.appcomponents.base.BaseActivity
import com.pgp.app.appcomponents.database.AppDatabase
import com.pgp.app.appcomponents.database.GolfCourseDao
import com.pgp.app.appcomponents.database.GolfHoleDao
import com.pgp.app.appcomponents.database.StrokesDao
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.appcomponents.utility.RecordScore40Module
import com.pgp.app.databinding.ActivityRecordScore40Binding
import com.pgp.app.modules.homelog.ui.HomelogActivity
import com.pgp.app.modules.recordscore20.ui.RecordScore20Activity
import com.pgp.app.modules.recordscore40.data.model.RecordScore40Model
import com.pgp.app.modules.recordscore40.data.viewmodel.RecordScore40VM
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.math.min


class RecordScore40Activity: BaseActivity<ActivityRecordScore40Binding>(R.layout.activity_record_score_4_0) {
    private val viewModel: RecordScore40VM by viewModels<RecordScore40VM>()
    private val recordScore40Module: RecordScore40Module by lazy {
        RecordScore40Module(this, this, viewModel, binding)
    }
    private val strokesDao: StrokesDao by inject<StrokesDao>()
    private lateinit var appPreferencesHelper: AppPreferencesHelper
    private val REQUEST_CODE_HOMELOG_ACTIVITY: Int = 381

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appPreferencesHelper = get()
    }

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")

        viewModel.recordScore40Model.observe(this, Observer { model ->
            binding.recordScore40VM = viewModel
            binding.clubnameresult.text = viewModel.recordScore40Model.value?.courseFinal
            binding.txtLanguage.text = viewModel.recordScore40Model.value?.txtLanguage
            binding.txtBlue.text = viewModel.recordScore40Model.value?.txtBlue
            binding.result01.text = viewModel.recordScore40Model.value?.strokesResult1
            binding.result02.text = viewModel.recordScore40Model.value?.strokesResult2
            binding.result03.text = viewModel.recordScore40Model.value?.strokesResult3
            binding.result04.text = viewModel.recordScore40Model.value?.strokesResult4
            binding.result05.text = viewModel.recordScore40Model.value?.strokesResult5
            binding.result06.text = viewModel.recordScore40Model.value?.strokesResult6
            binding.result07.text = viewModel.recordScore40Model.value?.strokesResult7
            binding.result08.text = viewModel.recordScore40Model.value?.strokesResult8
            binding.result09.text = viewModel.recordScore40Model.value?.strokesResult9
            binding.result10.text = viewModel.recordScore40Model.value?.strokesResult10
            binding.result11.text = viewModel.recordScore40Model.value?.strokesResult11
            binding.result12.text = viewModel.recordScore40Model.value?.strokesResult12
            binding.result13.text = viewModel.recordScore40Model.value?.strokesResult13
            binding.result14.text = viewModel.recordScore40Model.value?.strokesResult14
            binding.result15.text = viewModel.recordScore40Model.value?.strokesResult15
            binding.result16.text = viewModel.recordScore40Model.value?.strokesResult16
            binding.result17.text = viewModel.recordScore40Model.value?.strokesResult17
            binding.result18.text = viewModel.recordScore40Model.value?.strokesResult18
            binding.totalscore.text = viewModel.recordScore40Model.value?.txtTotalScore
            binding.scorediff.text = viewModel.recordScore40Model.value?.totalScoreDifferential
            binding.pcc.text = viewModel.recordScore40Model.value?.PCC
            // Calculate the total score
            var totalScore = 0
            viewModel.recordScore40Model.value?.let { model ->
                totalScore += model.strokesResult1?.toIntOrNull() ?: 0
                totalScore += model.strokesResult2?.toIntOrNull() ?: 0
                totalScore += model.strokesResult3?.toIntOrNull() ?: 0
                totalScore += model.strokesResult4?.toIntOrNull() ?: 0
                totalScore += model.strokesResult5?.toIntOrNull() ?: 0
                totalScore += model.strokesResult6?.toIntOrNull() ?: 0
                totalScore += model.strokesResult7?.toIntOrNull() ?: 0
                totalScore += model.strokesResult8?.toIntOrNull() ?: 0
                totalScore += model.strokesResult9?.toIntOrNull() ?: 0
                totalScore += model.strokesResult10?.toIntOrNull() ?: 0
                totalScore += model.strokesResult11?.toIntOrNull() ?: 0
                totalScore += model.strokesResult12?.toIntOrNull() ?: 0
                totalScore += model.strokesResult13?.toIntOrNull() ?: 0
                totalScore += model.strokesResult14?.toIntOrNull() ?: 0
                totalScore += model.strokesResult15?.toIntOrNull() ?: 0
                totalScore += model.strokesResult16?.toIntOrNull() ?: 0
                totalScore += model.strokesResult17?.toIntOrNull() ?: 0
                totalScore += model.strokesResult18?.toIntOrNull() ?: 0
            }
                // Update the totalFinalScore field
                model.txtTotalScore = totalScore.toString()

                Log.d("HoleData", "Total score: $totalScore")

                // Notify LiveData
                viewModel.recordScore40Model.postValue(model)

        })


        CoroutineScope(Dispatchers.Main).launch {
            for (i in 1..18) {
                val strokes = strokesDao.getStrokes(i.toString())
                val holeStrokes = strokes.firstOrNull()?.strokes ?: "0"
                // Log the strokes for each hole
                Log.d("HoleData", "Hole $i strokes: $holeStrokes")

                // Update the model with new values
                viewModel.recordScore40Model.value?.let { currentModel ->
                    val updatedModel = currentModel.copy().apply {
                        when (i) {
                            1 -> strokesResult1 = holeStrokes
                            2 -> strokesResult2 = holeStrokes
                            3 -> strokesResult3 = holeStrokes
                            4 -> strokesResult4 = holeStrokes
                            5 -> strokesResult5 = holeStrokes
                            6 -> strokesResult6 = holeStrokes
                            7 -> strokesResult7 = holeStrokes
                            8 -> strokesResult8 = holeStrokes
                            9 -> strokesResult9 = holeStrokes
                            10 -> strokesResult10 = holeStrokes
                            11 -> strokesResult11 = holeStrokes
                            12 -> strokesResult12 = holeStrokes
                            13 -> strokesResult13 = holeStrokes
                            14 -> strokesResult14 = holeStrokes
                            15 -> strokesResult15 = holeStrokes
                            16 -> strokesResult16 = holeStrokes
                            17 -> strokesResult17 = holeStrokes
                            18 -> strokesResult18 = holeStrokes
                        }

                        var hi = 0.0 // Handicap Index, change after getting the data
                        var pcc = 0.0 // Playing Conditions Calculation
                        calculateScoreDifferential(hi, pcc)
                    }
                    viewModel.recordScore40Model.postValue(updatedModel)
                }
            }

            }

                    val sharedPreferences = AppPreferencesHelper.getSharedPreferences(this)
                    val defTee = sharedPreferences.getString(AppPreferencesHelper.TeeTee, "")
                    val club = sharedPreferences.getString(AppPreferencesHelper.Club, "")
                    val course = sharedPreferences.getString(AppPreferencesHelper.Course, "")
                    val tee = when (defTee) {
                        "white_tee" -> "White"
                        "red_tee" -> "Red"
                        "blue_tee" -> "Blue"
                        else -> "Error. Could not get Tee Color"
                    }

                    val colorTee = when (tee) {
                        "Red" -> ContextCompat.getColor(this, R.color.red_401)
                        "Blue" -> ContextCompat.getColor(this, R.color.blue_400)
                        "White" -> ContextCompat.getColor(this, R.color.white)
                        else -> ContextCompat.getColor(this, R.color.white) // Default color
                    }
                    viewModel.recordScore40Model.value = RecordScore40Model(
                        txtLanguage = club,
                        txtBlue = tee,
                        courseFinal = course,
                        txtColorTee = colorTee
                    )

    }
    override fun setUpClicks() {
        binding.linearBottom.setOnClickListener {
            val destIntent = RecordScore20Activity.getIntent(this, null)
            startActivity(destIntent)
        }
        binding.btnSaveResults.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                strokesDao.deleteAllStrokes()
            }
            val destIntent = HomelogActivity.getIntent(this, null)
            startActivityForResult(destIntent, REQUEST_CODE_HOMELOG_ACTIVITY)
        }
    }

    private suspend fun calculateScoreDifferential(hi: Double, pcc: Double) {
        val database = AppDatabase.getInstance(this)
        val coursedao: GolfCourseDao = database.golfCourseDao()
        val holedao: GolfHoleDao = database.golfHoleDao()

        val course = viewModel.recordScore40Model.value?.txtLanguage
        val ratings = when (viewModel.recordScore40Model.value?.txtBlue) {
            "Red" -> course?.let { coursedao.getRedRatings(it) }
            "Blue" -> course?.let { coursedao.getBlueRatings(it) }
            "White" -> course?.let { coursedao.getWhiteRatings(it) }
            else -> null
        }

        if (ratings != null) {
            val courseId = course?.let { coursedao.getCourseIdByName(it) }
            val parValues = holedao.getParValues(courseId.toString())
            // 여기서 각 구멍의 스트로크 결과를 가져와 ag를 계산합니다.
            if (parValues != null) {
                val ch = hi * (ratings.srValue ?: 113) / 113.0
                var ag = 0.0
                for (i in 0 until 18) {
                    val strokeResult = when (i + 1) {
                        1 -> viewModel.recordScore40Model.value?.strokesResult1?.toDoubleOrNull()
                            ?: 0.0

                        2 -> viewModel.recordScore40Model.value?.strokesResult2?.toDoubleOrNull()
                            ?: 0.0

                        3 -> viewModel.recordScore40Model.value?.strokesResult3?.toDoubleOrNull()
                            ?: 0.0

                        4 -> viewModel.recordScore40Model.value?.strokesResult4?.toDoubleOrNull()
                            ?: 0.0

                        5 -> viewModel.recordScore40Model.value?.strokesResult5?.toDoubleOrNull()
                            ?: 0.0

                        6 -> viewModel.recordScore40Model.value?.strokesResult6?.toDoubleOrNull()
                            ?: 0.0

                        7 -> viewModel.recordScore40Model.value?.strokesResult7?.toDoubleOrNull()
                            ?: 0.0

                        8 -> viewModel.recordScore40Model.value?.strokesResult8?.toDoubleOrNull()
                            ?: 0.0

                        9 -> viewModel.recordScore40Model.value?.strokesResult9?.toDoubleOrNull()
                            ?: 0.0

                        10 -> viewModel.recordScore40Model.value?.strokesResult10?.toDoubleOrNull()
                            ?: 0.0

                        11 -> viewModel.recordScore40Model.value?.strokesResult11?.toDoubleOrNull()
                            ?: 0.0

                        12 -> viewModel.recordScore40Model.value?.strokesResult12?.toDoubleOrNull()
                            ?: 0.0

                        13 -> viewModel.recordScore40Model.value?.strokesResult13?.toDoubleOrNull()
                            ?: 0.0

                        14 -> viewModel.recordScore40Model.value?.strokesResult14?.toDoubleOrNull()
                            ?: 0.0

                        15 -> viewModel.recordScore40Model.value?.strokesResult15?.toDoubleOrNull()
                            ?: 0.0

                        16 -> viewModel.recordScore40Model.value?.strokesResult16?.toDoubleOrNull()
                            ?: 0.0

                        17 -> viewModel.recordScore40Model.value?.strokesResult17?.toDoubleOrNull()
                            ?: 0.0

                        18 -> viewModel.recordScore40Model.value?.strokesResult18?.toDoubleOrNull()
                            ?: 0.0

                        else -> 0.0
                    }
                }

                val scoreDifferential = if (ratings.srValue != null) {
                    (ag - ratings.crValue!! - pcc) * (113 / ratings.srValue)
                } else {
                    0.0
                }

                val roundedScoreDifferential = String.format("%.1f", scoreDifferential)

                // Save the calculated scoreDifferential to the model
                viewModel.recordScore40Model.value?.let { model ->
                    model.totalScoreDifferential = roundedScoreDifferential
                    // Notify LiveData
                    viewModel.recordScore40Model.postValue(model)
                }
            }
        }
    }

    companion object {
        const val TAG: String = "RECORD_SCORE40ACTIVITY"

    }
}
