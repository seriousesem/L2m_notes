package com.semDev.l2m_notes.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.semDev.l2m_notes.presentation.components.ads.AdMobInterstitial
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var adMobInterstitial: AdMobInterstitial

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adMobInterstitial.loadAds()
        setContent {
            L2mNotesApp(activity = this, adMobInterstitial = adMobInterstitial)
        }
    }
}
