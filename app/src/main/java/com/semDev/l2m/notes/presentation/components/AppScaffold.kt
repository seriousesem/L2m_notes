package com.semDev.l2m.notes.presentation.components
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.semDev.l2m.notes.presentation.components.AdMobBanner

@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit),
    bottomBar: @Composable (() -> Unit) = { AdMobBanner() },
    content: @Composable (PaddingValues) -> Unit,
) {
    Box() {
        Scaffold(
            modifier = modifier.padding(horizontal = 8.dp),
            topBar = topBar,
            content = content,
            containerColor = Color.Transparent,
            bottomBar = bottomBar,
        )
    }
}