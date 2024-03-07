package com.semDev.l2m_wiki.presentation.components
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.WhiteBlue
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    navigationIcon: @Composable (() -> Unit)? = null,
    actionIcon:  @Composable (RowScope.() -> Unit)? = null,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title.uppercase(Locale.ROOT),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = WhiteBlue
            )
        },
        navigationIcon = navigationIcon ?: {},
        actions = actionIcon ?: {},
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Blue,
            navigationIconContentColor = WhiteBlue,
            actionIconContentColor = WhiteBlue,
            titleContentColor = WhiteBlue
        )
    )
}