package com.semDev.l2m_notes.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.semDev.l2m_notes.presentation.features.alchemy_combinations.AlchemyCombinationsScreen
import com.semDev.l2m_notes.presentation.features.alchemy_statistics.AlchemyStatisticsScreen
import com.semDev.l2m_notes.presentation.features.auth.login.LoginScreen
import com.semDev.l2m_notes.presentation.features.auth.create_account.CreateAccountScreen
import com.semDev.l2m_notes.presentation.features.home.HomeScreen
import com.semDev.l2m_notes.presentation.features.splash.SplashScreen

@Composable
fun rememberAppState(navController: NavHostController = rememberNavController()) =
    remember(navController) {
        NavigationAction(navController)
    }

fun NavGraphBuilder.appGraph(navigationAction: NavigationAction, showAd: () -> Unit) {

    composable(SPLASH_SCREEN) {
        SplashScreen(openAndPopUp = { route, popUp ->
            navigationAction.navigateAndPopUp(
                route,
                popUp
            )
        })
    }
    composable(LOGIN_SCREEN) {
        LoginScreen(openAndPopUp = { route, popUp ->
            navigationAction.navigateAndPopUp(
                route,
                popUp
            )
        },
            openScreen = { route -> navigationAction.navigate(route) }
        )
    }
    composable(CREATE_ACCOUNT_SCREEN) {
        CreateAccountScreen(
            openAndPopUp = { route, popUp -> navigationAction.navigateAndPopUp(route, popUp) },
            popUpScreen = { navigationAction.popUp() }
        )
    }
    composable(HOME_SCREEN) {
        HomeScreen(
            openScreen = { route -> navigationAction.navigate(route) },
            showAd = showAd
        )
    }


    composable(ALCHEMY_COMBINATIONS_SCREEN) {
        AlchemyCombinationsScreen(
            popUpScreen = { navigationAction.popUp() },
            openScreen = { route -> navigationAction.navigate(route) },
        )
    }

    composable(ALCHEMY_STATISTICS_SCREEN) {
        AlchemyStatisticsScreen(
            popUpScreen = { navigationAction.popUp() },
            openScreen = { route -> navigationAction.navigate(route) },
        )
    }

}




