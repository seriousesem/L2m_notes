package com.semDev.l2m.notes.presentation.screens.home

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.presentation.components.AppScaffold
import com.semDev.l2m.notes.presentation.components.LanguageIconButton
import com.semDev.l2m.notes.presentation.components.TopBar
import com.semDev.l2m.notes.presentation.components.VerticalSpacing
import com.semDev.l2m.notes.presentation.navigation.Screens
import com.semDev.l2m.notes.presentation.theme.Grey700
import com.semDev.l2m.notes.utils.findActivity
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navHostController: NavHostController,
    showAd: () -> Unit
) {
    val context = LocalContext.current
    BackHandler(onBack = {
        context.findActivity()?.finish()
    })
    AppScaffold(
        topBar = {
            TopBar(
                title = stringResource(id = R.string.home_screen_title),
                navigationIcon = {
                },
                actionIcon = {
                    LanguageIconButton(
                        action = {}
                    )
                }
            )
        },
        bottomBar = {}
    ) { contentPadding ->
        HomeScreenView(
            contentPadding = contentPadding,
            navHostController = navHostController,
            showAd = showAd
        )
    }
}

@Composable
private fun HomeScreenView(
    contentPadding: PaddingValues,
    navHostController: NavHostController,
    showAd: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(
                top = contentPadding.calculateTopPadding(),
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        MenuItemView(
            navHostController = navHostController,
            route = Screens.AlchemyCombinations.route,
            description = R.string.alchemy_combinations_title,
            showAd = showAd
        )
        VerticalSpacing(spacing = 8)
        MenuItemView(
            navHostController = navHostController,
            route = Screens.AlchemyStatistics.route,
            description = R.string.alchemy_statistics_screen_title,
            showAd = showAd
        )
    }
}

@Composable
private fun MenuItemView(
    navHostController: NavHostController,
    route: String,
    description: Int,
    showAd: () -> Unit
) {
    Card(
        onClick = {
            showAd()
            navHostController.navigate(route)
        },
        modifier = Modifier
            .height(160.dp)
            .padding(vertical = 16.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black.copy(alpha = 0.6f)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = description),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray
            )
        }
    }
}