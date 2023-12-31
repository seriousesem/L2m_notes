package com.semDev.l2m.notes.presentation.components
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VerticalSpacing(spacing: Int) {
    Spacer(modifier = Modifier.height(spacing.dp))
}