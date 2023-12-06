package com.semDev.l2m.notes.presentation.screens.alchemy_combinations

import com.semDev.l2m.notes.R


sealed class AlchemyType(
    val description: Int,
) {
    data class NormalAlchemy(
        val normalAlchemyDescription: Int = R.string.normal_alchemy_screen_title,
    ) : AlchemyType(normalAlchemyDescription)

    data class TopAlchemy(
        val topAlchemyDescription: Int = R.string.top_alchemy_screen_title,
    ) : AlchemyType(topAlchemyDescription)
}
