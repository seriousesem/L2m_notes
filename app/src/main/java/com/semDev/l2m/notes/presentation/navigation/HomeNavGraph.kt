package com.semDev.l2m.notes.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.semDev.l2m.notes.presentation.screens.alchemy.AlchemyScreen
import com.semDev.l2m.notes.presentation.screens.home.HomeScreen

@Composable
fun HomeNavGraph(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = Screens.HomeScreen.route
    ) {
        composable(route = Screens.HomeScreen.route) {
            HomeScreen(navHostController = navHostController)
        }
        composable(route = Screens.AlchemyScreen.route) {
            AlchemyScreen()
        }
    }
}

sealed class Screens (
    val route: String
){
    object HomeScreen : Screens(
        route = "HomeScreen"
    )
    object AlchemyScreen : Screens(
        route = "AlchemyScreen"
    )
}



