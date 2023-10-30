package com.semDev.l2m.notes.presentation.navigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.presentation.navigation.ScreensRoute.SIMPLY_ALCHEMY_SCREEN
import com.semDev.l2m.notes.presentation.navigation.ScreensRoute.HIGHER_ALCHEMY_SCREEN
import com.semDev.l2m.notes.presentation.screens.alchemy.HigherAlchemy
import com.semDev.l2m.notes.presentation.screens.alchemy.SimplyAlchemy


@Composable
fun AlchemyNavGraph(
    navHostController: NavHostController,
) {

    NavHost(
        navController = navHostController,
//        route = Graphs.ALCHEMY,
        startDestination = AlchemyScreens.SimplyAlchemy.route
    ) {
        composable(route = AlchemyScreens.SimplyAlchemy.route) {
            SimplyAlchemy()
        }
        composable(route = AlchemyScreens.HigherAlchemy.route) {
            HigherAlchemy()
        }
    }
}

sealed class AlchemyScreens(
    val route: String,
    val title: Int,
    val icon: ImageVector
) {
    object SimplyAlchemy : AlchemyScreens(
        route = SIMPLY_ALCHEMY_SCREEN,
        title = R.string.simply_alchemy,
        icon = Icons.Default.Home
    )
    object HigherAlchemy : AlchemyScreens(
        route = HIGHER_ALCHEMY_SCREEN,
        title = R.string.higher_alchemy,
        icon = Icons.Default.Home
    )
}

object ScreensRoute {
    const val SIMPLY_ALCHEMY_SCREEN = "simply_alchemy_screen"
    const val HIGHER_ALCHEMY_SCREEN = "higher_alchemy_screen"
}
