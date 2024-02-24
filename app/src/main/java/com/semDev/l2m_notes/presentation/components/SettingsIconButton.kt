package com.semDev.l2m_notes.presentation.components
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsIconButton(action: () -> Unit) {
    IconButton(
        onClick = action ,
    )
    {
        Icon(
            imageVector = Icons.Outlined.Settings,
            contentDescription = null,
            modifier = Modifier.size(28.dp)
        )
    }
}