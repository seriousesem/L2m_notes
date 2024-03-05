package com.semDev.l2m_wiki.app

import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import com.semDev.l2m_wiki.core.navigation.appGraph
import com.semDev.l2m_wiki.core.navigation.rememberAppState
import com.semDev.l2m_wiki.presentation.components.ads.AdMobInterstitial
import com.semDev.l2m_wiki.presentation.theme.L2mNotesTheme


@Composable
fun L2mNotesApp(
    activity: Activity, adMobInterstitial: AdMobInterstitial,
    viewModel: AppViewModel = hiltViewModel()
) {
    L2mNotesTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            val appState = rememberAppState()
            Scaffold { innerPaddingModifier ->
                NavHost(
                    navController = appState.navController,
                    startDestination = viewModel.checkAuth(),
                    modifier = Modifier.padding(innerPaddingModifier)
                ) {
                    appGraph(appState, showAd = { adMobInterstitial.showAds(activity) })
                }
            }
        }
    }
}
