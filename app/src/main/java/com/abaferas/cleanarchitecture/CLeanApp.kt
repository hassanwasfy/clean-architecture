package com.abaferas.cleanarchitecture

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CLeanApp: Application() {

    override fun onCreate() {
        super.onCreate()
    }

}