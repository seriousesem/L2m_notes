package com.semDev.l2m_wiki.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.semDev.l2m_wiki.presentation.components.ads.AdMobInterstitial
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var adMobInterstitial: AdMobInterstitial

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        adMobInterstitial.loadAds()
        setContent {
            L2mNotesApp(activity = this, adMobInterstitial = adMobInterstitial)
        }
    }
}
