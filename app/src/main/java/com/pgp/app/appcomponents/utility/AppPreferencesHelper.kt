package com.pgp.app.appcomponents.utility

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.pgp.app.R


object AppPreferencesHelper {
    private const val PREF_NAME = "MyPrefs"
    const val KEY_USERNAME = "userid"
    private const val PREF_KEY_COURSE_ID = "PREF_KEY_COURSE_ID"
    const val REGISTER_1 = "username"
    const val REGISTER_2 = "userfirstname"
    const val REGISTER_3 = "userlastname"
    const val REGISTER_4 = "userpassword"

    const val Club = "golfclub"
    const val ClubId = "clubid"
    const val Malaysiastate = "state"
    const val Course = "golfcourse"
    const val Courseid = "courseid"
    const val TeeTee = "tee"

    const val KEY_HOLE_NUMBER = "hole_number"

    private val MASTER_KEY_ALIAS = createGetMasterKey()
    private fun getPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
    fun getSharedPreferences(context: Context): SharedPreferences {
        return EncryptedSharedPreferences.create(
            context.resources.getString(R.string.app_name),
            MASTER_KEY_ALIAS,
            context.applicationContext,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    private fun createGetMasterKey(): String {
        return MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
    }

    fun saveUsername(context: Context, username: String?) {
        Log.d("AppPreferencesHelper", "Saving username: $username")
        try {
            val editor = getSharedPreferences(context).edit()
            editor.putString(KEY_USERNAME, username)
            editor.apply()
            Log.d("AppPreferencesHelper", "Username saved successfully.")
        } catch (e: Exception) {
            Log.e("AppPreferencesHelper", "Error saving username", e)
        }
    }


    fun getFullName(context: Context, dbHelper: RegisterDBHelper): String {
        val username = getSharedPreferences(context).getString(KEY_USERNAME, "")
        val fullName = dbHelper.getFullNameByUsername(username)
        Log.d("HomelogActivity", "Full Name from getFullName: $fullName")
        return fullName ?: ""

    }

    fun saveUserData(
        context: Context,
        username: String?,
        fnInput: String?,
        lnInput: String?,
        pwInput: String?
    ) {
        val editor = getSharedPreferences(context).edit()
        editor.putString(REGISTER_1, username)
        editor.putString(REGISTER_2, fnInput)
        editor.putString(REGISTER_3, lnInput)
        editor.putString(REGISTER_4, pwInput)
        editor.apply()
    }

    fun saveGolfClubData(
        context: Context,
        clubId: Long,
        club: String?,
        state: String?,

        ) {
        Log.d("AppPreferencesHelper", "Saving Golf Club Data: $clubId, $club, $state")
        try {
            val editor = getSharedPreferences(context).edit()
            editor.putLong(ClubId, clubId)
            editor.putString(Club, club)
            editor.putString(Malaysiastate, state)

            editor.apply()
            Log.d("AppPreferencesHelper", "Golf Club Data saved successfully.")
        } catch (e: Exception) {
            Log.e("AppPreferencesHelper", "Error saving Golf Club Data", e)
        }
    }

    fun saveGolfCourseData(

        context: Context,
        course: String?,

        ) {
        try {
            val editor = getSharedPreferences(context).edit()
            editor.putString(Course, course)


            editor.apply()

            Log.d("AppPreferencesHelper", "Golf Course Data saved successfully.")
        } catch (e: Exception) {
            Log.e("AppPreferencesHelper", "Error saving Golf Course Data", e)
        }
    }

    fun saveGolfCourseIDData(
        context: Context,
        courseid: Long
    ) {
        val editor = getSharedPreferences(context).edit()
        editor.putLong(Courseid, courseid)
        editor.apply()

    }

    fun getSavedCourseId(context: Context): Long? {
        return getSharedPreferences(context).getLong(Courseid, -1)
    }

    fun saveGolfTeeData(
        context: Context,
        Tee: String?,
    ) {
        val editor = getSharedPreferences(context).edit()

        editor.putString(TeeTee, Tee)
        editor.apply()

    }


    fun saveHoleNumber(context: Context, holeNumber: Int) {
        val editor = getSharedPreferences(context).edit()
        editor.putInt(KEY_HOLE_NUMBER, holeNumber)
        editor.apply()
    }


    fun getHoleNumber(context: Context): Int {
        return getSharedPreferences(context).getInt(KEY_HOLE_NUMBER, 1)
    }

    fun getCourseID(context: Context): Long {
        return getSharedPreferences(context).getLong(PREF_KEY_COURSE_ID, -1)
    }

}



