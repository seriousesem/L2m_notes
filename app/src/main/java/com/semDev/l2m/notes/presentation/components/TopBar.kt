package com.semDev.l2m.notes.presentation.components
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String,
    navigationIcon: @Composable () -> Unit,
    actionIcon:  @Composable (RowScope.() -> Unit),
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
            )
        },
        navigationIcon = navigationIcon,
        actions = actionIcon,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Cyan,
            navigationIconContentColor = DarkGray,
            titleContentColor = DarkGray
        )
    )
}