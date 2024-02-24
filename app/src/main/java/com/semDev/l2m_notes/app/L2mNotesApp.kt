package com.semDev.l2m_notes.app

import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.semDev.l2m_notes.core.navigation.SPLASH_SCREEN
import com.semDev.l2m_notes.core.navigation.appGraph
import com.semDev.l2m_notes.core.navigation.rememberAppState
import com.semDev.l2m_notes.presentation.components.ads.AdMobInterstitial
import com.semDev.l2m_notes.presentation.theme.L2mNotesTheme


@Composable
fun L2mNotesApp(activity: Activity, adMobInterstitial: AdMobInterstitial) {
    L2mNotesTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            val appState = rememberAppState()
            Scaffold { innerPaddingModifier ->
                NavHost(
                    navController = appState.navController,
                    startDestination = SPLASH_SCREEN,
                    modifier = Modifier.padding(innerPaddingModifier)
                ) {
                    appGraph(appState, showAd = { adMobInterstitial.showAds(activity) })
                }
            }
        }
    }
}
