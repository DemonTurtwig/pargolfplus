package com.pgp.app.modules.recordscore40.data.model

import android.text.Editable
import androidx.core.content.ContextCompat
import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class RecordScore40Model(
    /**
     * TODO Replace with dynamic value
     */
    var txtResults: String? = MyApp.getInstance().resources.getString(R.string.lbl_results)
    ,

    var courseFinal: String? = MyApp.getInstance().resources.getString(R.string.lbl_courses),
    /**
     * TODO Replace with dynamic value
     */
    var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtTeeColour: String? = MyApp.getInstance().resources.getString(R.string.lbl_tee_colour)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtBlue: String? = MyApp.getInstance().resources.getString(R.string.tee_blue),

    var txtColorTee: Int? = ContextCompat.getColor(MyApp.getInstance(), R.color.blue_400),
    /**
     * TODO Replace with dynamic value
     */
    var txtAndrewWade: String? = MyApp.getInstance().resources.getString(R.string.lbl_philip_low)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_00)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txt31hcp: String? = MyApp.getInstance().resources.getString(R.string.lbl_hcp)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_01)
    ,

    var txtHoleCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_10)
    ,
    /**
     * TODO Replace with dynamic value
     */

    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_02)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_09)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_02)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_11)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_03)
    ,
    /**
     * TODO Replace with dynamic value
     */

    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_12)
    ,
    /**
     * TODO Replace with dynamic value
     */

    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_04)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_13)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_05)
    ,
    /**
     * TODO Replace with dynamic value
     */

    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOneTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_14)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_06)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOneThree: String? =
        MyApp.getInstance().resources.getString(R.string.lbl_hole_15)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_07)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOneFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_16)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_08)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOneFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_17)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtHoleCounterOneSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_hole_18)
    ,
    /**
     * TODO Replace with dynamic value
     */
    /**
     * TODO Replace with dynamic value
     */
    var txtTotalScore2: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_score),

    var txtTotalScore: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtScoreDifferent: String? =
        MyApp.getInstance().resources.getString(R.string.msg_score_different)
    ,
    /**
     * TODO Replace with dynamic value
     */
    var txtPCCadjustment: String? =
        MyApp.getInstance().resources.getString(R.string.lbl_pcc_adjustment)
    ,
    var strokesResult1: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult2: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult3: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult4: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult5: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult6: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult7: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult8: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult9: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult10: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult11: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult12: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult13: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult14: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult15: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult16: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult17: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var strokesResult18: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var totalFinalScore: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var totalScoreDifferential: String? = MyApp.getInstance().resources.getString(R.string.lbl_9),
    var PCC: Editable? = null

)
