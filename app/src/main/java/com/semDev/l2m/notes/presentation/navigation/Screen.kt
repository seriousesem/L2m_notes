package com.semDev.l2m.notes.presentation.navigation

import com.semDev.l2m.notes.presentation.navigation.ScreensRoute.HOME_SCREEN

sealed class Screen(val route: String) {
    object Home : Screen(route = HOME_SCREEN)
}

object ScreensRoute {
    const val HOME_SCREEN = "home_screen"
}
