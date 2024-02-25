package com.semDev.l2m_notes.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semDev.l2m_notes.R
import com.semDev.l2m_notes.core.navigation.ALCHEMY_COMBINATIONS_SCREEN
import com.semDev.l2m_notes.core.navigation.ALCHEMY_STATISTICS_SCREEN
import com.semDev.l2m_notes.core.navigation.HOME_SCREEN

@Composable
fun NavigationDrawer(
    openScreen: (String) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        verticalArrangement = Arrangement.Center
    ) {
        NavigationItem(
            resId = R.drawable.ic_baseline_history_24,
            text = stringResource(id = R.string.home_screen_title),
        ) {
            openScreen(HOME_SCREEN)
        }
        VerticalSpacing(spacing = 32)
        NavigationItem(
            resId = R.drawable.ic_baseline_history_24,
            text = stringResource(id = R.string.alchemy_combinations_title),
        ) {
            openScreen(ALCHEMY_COMBINATIONS_SCREEN)
        }
        VerticalSpacing(spacing = 32)
        NavigationItem(
            resId = R.drawable.ic_baseline_history_24,
            text = stringResource(id = R.string.alchemy_statistics_screen_title),
        ) {
            openScreen(ALCHEMY_STATISTICS_SCREEN)
        }
        VerticalSpacing(spacing = 32)
        NavigationItem(
            resId = R.drawable.ic_baseline_history_24,
            text = "Settings"
        ) {}
    }
}

@Composable
fun NavigationItem(
    resId: Int,
    text: String,
    topPadding: Dp = 20.dp,
    destination: String = "",
    itemClicked: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .width(180.dp)
            .padding(start = 8.dp, top = topPadding)
            .clickable { itemClicked(destination) }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = resId),
                contentDescription = "Item Image",
                modifier = Modifier.size(30.dp)
            )
            Text(
                text = text,
                color = Color.White,
                fontWeight = FontWeight.W700,
                fontSize = 16.sp,
                maxLines = 2
            )
        }
    }
}