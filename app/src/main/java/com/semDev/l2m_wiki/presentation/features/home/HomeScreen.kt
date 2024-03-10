package com.semDev.l2m_wiki.presentation.features.home

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.core.navigation.ALCHEMY_COMBINATIONS_SCREEN
import com.semDev.l2m_wiki.core.navigation.ALCHEMY_STATISTICS_SCREEN
import com.semDev.l2m_wiki.core.navigation.SETTINGS_SCREEN
import com.semDev.l2m_wiki.presentation.components.AppScaffold
import com.semDev.l2m_wiki.presentation.components.SettingsIconButton
import com.semDev.l2m_wiki.presentation.components.TopBar
import com.semDev.l2m_wiki.presentation.components.VerticalSpacing
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.WhiteBlue
import com.semDev.l2m_wiki.utils.findActivity

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
        topBar = {
            TopBar(
                title = stringResource(id = R.string.home_screen_title),
                actionIcon = {
                    SettingsIconButton(action =
                    { openScreen(SETTINGS_SCREEN) }
                    )
                }
            )
        },
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
                vertical = contentPadding.calculateTopPadding(),
                horizontal = 16.dp
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        VerticalSpacing(spacing = 32)
        MenuItemView(
            resId = R.drawable.alchemy_menu_icon,
            description = R.string.alchemy_combinations_title,
            route = ALCHEMY_COMBINATIONS_SCREEN,
            openScreen = openScreen,
            showAd = showAd
        )
        VerticalSpacing(spacing = 32)
        MenuItemView(
            resId = R.drawable.statistic_menu_icon,
            description = R.string.alchemy_statistics_screen_title,
            route = ALCHEMY_STATISTICS_SCREEN,
            openScreen = openScreen,
            showAd = showAd
        )

    }
}

@Composable
private fun MenuItemView(
    resId: Int,
    description: Int,
    route: String,
    openScreen: (String) -> Unit,
    showAd: () -> Unit
) {
    Card(
        onClick = {
            showAd()
            openScreen(route)
        },
        modifier = Modifier
            .height(120.dp),
        colors = CardDefaults.cardColors(
            containerColor = WhiteBlue,
            contentColor = Blue
        ),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke( width = 1.dp, color = Blue)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                modifier = Modifier.size(80.dp),
                painter = painterResource(id = resId),
                contentDescription = "",
                tint = Blue
            )
            Text(
                modifier = Modifier.width(200.dp),
                text = stringResource(id = description),
                textAlign = TextAlign.Center,
                maxLines = 2,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Blue
            )
        }
    }
}