package com.semDev.l2m.notes.presentation.screens.alchemy

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.semDev.l2m.notes.R


sealed class AlchemyType(
    val description: Int,
    val icon: ImageVector,
) {
    data class NormalAlchemy(
        val normalAlchemyDescription: Int = R.string.normal_alchemy,
        val normalAlchemyIcon: ImageVector = Icons.Default.Home,
    ) : AlchemyType(normalAlchemyDescription, normalAlchemyIcon)

    data class TopAlchemy(
        val topAlchemyDescription: Int = R.string.top_alchemy,
        val topAlchemyIcon: ImageVector = Icons.Default.Home,
    ) : AlchemyType(topAlchemyDescription, topAlchemyIcon)
}
