package com.semDev.l2m.notes.app

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.semDev.l2m.notes.presentation.components.ads.AppOpenManager
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        try {
            MobileAds.initialize(this)
            AppOpenManager(this)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
