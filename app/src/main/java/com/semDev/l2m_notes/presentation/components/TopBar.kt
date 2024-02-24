package com.semDev.l2m_notes.presentation.components
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.semDev.l2m_notes.presentation.theme.Grey700

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
                fontSize = 20.sp,
                fontWeight = FontWeight.W500,
            )
        },
        navigationIcon = navigationIcon,
        actions = actionIcon,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Grey700,
            navigationIconContentColor = LightGray,
            actionIconContentColor = LightGray,
            titleContentColor = LightGray
        )
    )
}