package com.semDev.l2m_notes.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semDev.l2m_notes.presentation.theme.Grey700

@Composable
fun AppElevatedButton(
    modifier: Modifier,
    label: String,
    enabled: Boolean,
    buttonAction: () -> Unit
){
    return  Button(
        onClick = { buttonAction()},
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp),
        colors = ButtonColors(
            containerColor = Grey700,
            contentColor = Color.LightGray,
            disabledContentColor = Color.LightGray,
            disabledContainerColor = Color.Gray
        )
    ) {
        Text(
            text = label,
            fontSize = 18.sp,
            modifier = modifier.padding(0.dp, 6.dp)
        )
    }
}