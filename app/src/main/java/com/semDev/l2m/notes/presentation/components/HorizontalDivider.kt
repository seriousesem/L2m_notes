package com.semDev.l2m.notes.presentation.components
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDivider(){
    Divider(
        modifier = Modifier.fillMaxWidth().width(1.dp)
    )
}