package com.pgp.app.appcomponents.utility

import android.content.Context
import android.content.SharedPreferences
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
    private val MASTER_KEY_ALIAS = createGetMasterKey()
    private fun getSharedPreferences(context: Context): SharedPreferences {
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
        val editor = getSharedPreferences(context).edit()
        editor.putString(KEY_USERNAME, username)
        editor.apply()
    }

    fun getFullName(context: Context, dbHelper: RegisterDBHelper): String {
        val username = getSharedPreferences(context).getString(KEY_USERNAME, "")
        val fullName = dbHelper.getFullNameByUsername(username)
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

    fun fetchUserData(context: Context): Map<String, String?> {
        val sharedPreferences = getSharedPreferences(context)
        val userData: MutableMap<String, String?> = HashMap()
        userData[REGISTER_1] =
            sharedPreferences.getString(REGISTER_1, "")
        userData[REGISTER_2] =
            sharedPreferences.getString(REGISTER_2, "")
        userData[REGISTER_3] =
            sharedPreferences.getString(REGISTER_3, "")
        userData[REGISTER_4] =
            sharedPreferences.getString(REGISTER_4, "")
        return userData
    }
}