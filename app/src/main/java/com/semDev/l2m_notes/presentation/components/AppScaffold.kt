package com.semDev.l2m_notes.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit),
    bottomBar: @Composable (() -> Unit),
    content: @Composable (PaddingValues) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        content = content,
        containerColor = Color.White,
    )
}