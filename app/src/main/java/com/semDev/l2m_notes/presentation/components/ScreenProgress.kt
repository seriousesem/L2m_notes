package com.semDev.l2m_notes.presentation.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun ScreenProgress() {
    CircularProgressIndicator(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentSize(Alignment.Center),
    )
}