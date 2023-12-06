package com.semDev.l2m.notes.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.semDev.l2m.notes.presentation.screens.alchemy_combinations.AlchemyCombinationsScreen
import com.semDev.l2m.notes.presentation.screens.alchemy_statistics.AlchemyStatisticsScreen
import com.semDev.l2m.notes.presentation.screens.home.HomeScreen

@Composable
fun HomeNavGraph(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = Screens.Home.route
    ) {
        composable(route = Screens.Home.route) {
            HomeScreen(navHostController = navHostController)
        }
        composable(route = Screens.AlchemyCombinations.route) {
            AlchemyCombinationsScreen(navHostController = navHostController)
        }
        composable(route = Screens.AlchemyStatistics.route) {
            AlchemyStatisticsScreen(navHostController = navHostController)
        }
    }
}

sealed class Screens (
    val route: String
){
    object Home : Screens(
        route = "Home"
    )
    object AlchemyCombinations : Screens(
        route = "AlchemyCombinations"
    )
    object AlchemyStatistics : Screens(
        route = "AlchemyStatistics"
    )
}



