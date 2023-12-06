package com.semDev.l2m.notes.presentation.components
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.semDev.l2m.notes.presentation.theme.Indigo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    navigationIcon: @Composable () -> Unit,
    actionIcon:  @Composable (RowScope.() -> Unit),
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
        },
        navigationIcon = navigationIcon,
        actions = actionIcon,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = DarkGray,
            navigationIconContentColor = LightGray,
            actionIconContentColor = LightGray,
            titleContentColor = LightGray
        )
    )
}