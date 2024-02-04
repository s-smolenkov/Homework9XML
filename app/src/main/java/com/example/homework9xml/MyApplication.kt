package com.example.homework9xml

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class MyApplication : Application() {

    private lateinit var sharedPrefs: SharedPreferences

    override fun onCreate() {
        super.onCreate()
        instance = this
        sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    }

    fun saveData(number: Int) {
        sharedPrefs.edit().putInt("MyString", number).apply()
    }

    fun getSavedData(): Int {
        return sharedPrefs.getInt("MyString", 0)
    }

    companion object {
        private lateinit var instance: MyApplication
        fun getApp() = instance
    }
}