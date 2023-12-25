package com.semDev.l2m.notes.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.semDev.l2m.notes.presentation.components.ads.AdMobInterstitial
import com.semDev.l2m.notes.presentation.navigation.HomeNavGraph
import com.semDev.l2m.notes.presentation.theme.L2mNotesTheme
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
            L2mNotesTheme {
                HomeNavGraph(
                    navHostController = rememberNavController(),
                    showAd = { adMobInterstitial.showAds(this) }
                )
            }
        }
    }
}
