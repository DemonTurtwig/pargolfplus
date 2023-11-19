package com.pgp.app.modules.homelog.data.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HomelogVMFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomelogVM::class.java)) {
            return HomelogVM(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}