package com.semDev.l2m_notes.app

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.semDev.l2m_notes.core.localization.Localization
import com.semDev.l2m_notes.presentation.components.ads.AppOpenManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {
    @Inject
    lateinit var localization: Localization
    override fun onCreate() {
        super.onCreate()
        localization.loadLanguage()
        try {
            MobileAds.initialize(this)
            AppOpenManager(this)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
