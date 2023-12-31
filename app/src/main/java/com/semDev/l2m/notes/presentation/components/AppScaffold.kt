package com.semDev.l2m.notes.presentation.components
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun AppScaffold(
    modifier: Modifier = Modifier
        .fillMaxSize(),
    bottomBar: @Composable (() -> Unit),
    content: @Composable (PaddingValues) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        bottomBar = bottomBar,
        content = content,
        containerColor = Color.Transparent,
    )
}