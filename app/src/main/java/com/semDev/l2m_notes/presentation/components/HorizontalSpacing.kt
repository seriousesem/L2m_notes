package com.semDev.l2m_notes.presentation.components
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalSpacing(spacing: Int) {
    Spacer(modifier = Modifier.width(spacing.dp))
}