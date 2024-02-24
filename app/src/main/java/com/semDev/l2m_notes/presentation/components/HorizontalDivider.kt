package com.semDev.l2m_notes.presentation.components
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDivider1(padding: Int){
    HorizontalDivider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = padding.dp)
        ,
        thickness = 1.dp
    )
}