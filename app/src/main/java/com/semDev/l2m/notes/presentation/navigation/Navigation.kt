package com.semDev.l2m.notes.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.semDev.l2m.notes.presentation.screens.home.HomeScreen

@Composable
fun Navigation(showAd: () -> Unit) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
    }
}


