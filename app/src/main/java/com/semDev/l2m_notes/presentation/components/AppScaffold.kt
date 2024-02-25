package com.semDev.l2m_notes.presentation.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable ((action: () -> Unit) -> Unit),
    bottomBar: @Composable (() -> Unit)? = null,
    openScreen: (String) -> Unit,
    content: @Composable (PaddingValues) -> Unit,
) {
    var isOpenDrawer by remember { mutableStateOf(false) }
    val offSetAnim by animateDpAsState(
        targetValue = if (isOpenDrawer) 200.dp else 0.dp,
        label = ""
    )
    val scaleAnim by animateFloatAsState(
        targetValue = if (isOpenDrawer) 0.5f else 1.0f,
        label = ""
    )
    NavigationDrawer(
        openScreen = openScreen,
    )
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .scale(scaleAnim)
            .offset(x = offSetAnim)
            .clip(if (isOpenDrawer) RoundedCornerShape(30.dp) else RoundedCornerShape(0.dp))
            .clickable { isOpenDrawer = ! isOpenDrawer },
        topBar = { topBar { isOpenDrawer = !isOpenDrawer } },
        bottomBar = bottomBar ?: {},
        content = content,
        containerColor = Color.White,
    )
}

