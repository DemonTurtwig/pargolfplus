package com.pgp.app.modules.homelog.data.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pgp.app.appcomponents.utility.RegisterDBHelper

class HomelogVMFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomelogVM::class.java)) {
            // Pass the context parameter to the RegisterDBHelper constructor
            val dbHelper = RegisterDBHelper(context)
            return HomelogVM(context, dbHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}