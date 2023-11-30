package com.pgp.app.appcomponents.utility

import android.content.Context
import androidx.core.content.ContextCompat
import com.pgp.app.R
import com.pgp.app.appcomponents.database.AppDatabase
import com.pgp.app.appcomponents.database.GolfCourseDao
import com.pgp.app.appcomponents.database.GolfHoleDao
import com.pgp.app.databinding.ActivityRecordScore40Binding
import com.pgp.app.modules.recordscore30.data.model.RecordScore30Model
import com.pgp.app.modules.recordscore40.data.model.RecordScore40Model
import com.pgp.app.modules.recordscore40.data.viewmodel.RecordScore40VM
import com.pgp.app.modules.recordscore40.ui.RecordScore40Activity
import kotlin.math.min


class RecordScore40Module(
    private val context: Context,
    private val activity: RecordScore40Activity,
    private val viewModel: RecordScore40VM,
    private val binding: ActivityRecordScore40Binding
) {
    val dbHelper = RegisterDBHelper(context)
    public val appPreferencesHelper = AppPreferencesHelper
    init {

        // Initialize RecordScore40Model
        viewModel.recordScore40Model.value = RecordScore40Model()

    }

}