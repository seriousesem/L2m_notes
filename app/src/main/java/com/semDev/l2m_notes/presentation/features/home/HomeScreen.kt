package com.semDev.l2m_notes.presentation.features.home

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.play.integrity.internal.o
import com.semDev.l2m_notes.R
import com.semDev.l2m_notes.core.navigation.ALCHEMY_COMBINATIONS_SCREEN
import com.semDev.l2m_notes.core.navigation.ALCHEMY_STATISTICS_SCREEN
import com.semDev.l2m_notes.presentation.components.AppScaffold
import com.semDev.l2m_notes.presentation.components.MenuIconButton
import com.semDev.l2m_notes.presentation.components.TopBar
import com.semDev.l2m_notes.presentation.components.VerticalSpacing
import com.semDev.l2m_notes.utils.findActivity

@Composable
fun HomeScreen(
    openScreen: (String) -> Unit,
    showAd: () -> Unit
) {
    val context = LocalContext.current
    BackHandler(onBack = {
        context.findActivity()?.finish()
    })
    AppScaffold(
        topBar = { openDrawer ->
            TopBar(
                title = stringResource(id = R.string.home_screen_title),
                navigationIcon = {
                },
                actionIcon = {
                    MenuIconButton(
                        action = openDrawer
                    )
                }
            )
        },
        openScreen = openScreen
    ) { contentPadding ->
        HomeScreenView(
            contentPadding = contentPadding,
            openScreen = openScreen,
            showAd = showAd
        )
    }
}

@Composable
private fun HomeScreenView(
    contentPadding: PaddingValues,
    openScreen: (String) -> Unit,
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
            openScreen = openScreen,
            route = ALCHEMY_COMBINATIONS_SCREEN,
            description = R.string.alchemy_combinations_title,
            showAd = showAd
        )
        VerticalSpacing(spacing = 8)
        MenuItemView(
            openScreen = openScreen,
            route = ALCHEMY_STATISTICS_SCREEN,
            description = R.string.alchemy_statistics_screen_title,
            showAd = showAd
        )
    }
}

@Composable
private fun MenuItemView(
    openScreen: (String) -> Unit,
    route: String,
    description: Int,
    showAd: () -> Unit
) {
    Card(
        onClick = {
            // TODO: uncomment
//            showAd()
            openScreen(route)
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