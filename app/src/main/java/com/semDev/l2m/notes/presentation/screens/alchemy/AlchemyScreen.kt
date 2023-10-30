package com.semDev.l2m.notes.presentation.screens.alchemy

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.semDev.l2m.notes.presentation.components.AppScaffold
import com.semDev.l2m.notes.presentation.navigation.AlchemyNavGraph
import com.semDev.l2m.notes.presentation.navigation.AlchemyScreens


@Composable
fun AlchemyScreen(
    navHostController: NavHostController = rememberNavController(),
) {
    val context = LocalContext.current
//    BackHandler(onBack = {
//        navHostController.popBackStack()
//    })
    AppScaffold(
        bottomBar = {
            BottomBar(navController = navHostController)
        }
    ) {
        AlchemyNavGraph(
            navHostController = navHostController,
        )

    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        AlchemyScreens.SimplyAlchemy,
        AlchemyScreens.HigherAlchemy,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarDestination = screens.any { it.route == currentDestination?.route }

    if (bottomBarDestination) {
        BottomNavigation {
            screens.forEach { screen ->
                BottomBar(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}

@Composable
fun RowScope.BottomBar(
    screen: AlchemyScreens,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(text = stringResource(id = screen.title))
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}