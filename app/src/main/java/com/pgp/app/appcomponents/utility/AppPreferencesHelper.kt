package com.pgp.app.appcomponents.utility

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.pgp.app.R


object AppPreferencesHelper {
    private const val PREF_NAME = "MyPrefs"
    private const val KEY_USERNAME = "userid"
    const val REGISTER_1 = "username"
    const val REGISTER_2 = "userfirstname"
    const val REGISTER_3 = "userlastname"
    const val REGISTER_4 = "userpassword"

    const val Club = "golfclub"
    const val Malaysiastate = "state"
    const val Course = "golfcourse"
    const val TeeTee = "tee"

    private val MASTER_KEY_ALIAS = createGetMasterKey()
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
        club: String?,
        state: String?,
        course: String?,
        tee: String?
    ) {
        Log.d("AppPreferencesHelper", "Saving Golf Club Data: $club, $state, $course, $tee")
        try {
            val editor = getSharedPreferences(context).edit()
            editor.putString(Club, club)
            editor.putString(Malaysiastate, state)
            editor.putString(Course, course)
            editor.putString(TeeTee, tee)
            editor.apply()
            Log.d("AppPreferencesHelper", "Golf Club Data saved successfully.")
        } catch (e: Exception) {
            Log.e("AppPreferencesHelper", "Error saving Golf Club Data", e)
        }
    }

    fun getClubId(context: Context, clubName: String): Long {
        val sharedPreferences = getSharedPreferences(context)
        val savedClubName = sharedPreferences.getString(Club, "")
        return if (savedClubName == clubName) {
            sharedPreferences.getLong(Course + "_$savedClubName", 0)
        } else {
            0
        }
    }

}