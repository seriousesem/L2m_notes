package com.semDev.l2m.notes.utils

import com.semDev.l2m.notes.R

object ImageAssets {
    val RARE_ITEM = R.drawable.rare_item
    val HEROIC_ITEM = R.drawable.heroic_item
    val LEGENDARY_ITEM = R.drawable.legendary_item
    val GRACIA_MAGIC_STONE_ITEM = R.drawable.gracia_magic_stone_item
    val ORIGINAL_STONE_ITEM = R.drawable.original_stone_item
    val PENDANT_STONE_ITEM = R.drawable.pendant_stone_item
    val PENDANT_ENCHANT_ITEM = R.drawable.pendant_enchant_item

}

object MapKeys {
    const val CONTEXT_KEY = "context_key"
    const val MESSAGE_KEY = "message_key"
}

object RoomConstants {
    const val DATABASE_NAME = "l2m_notes_db"
    const val DATABASE_VERSION = 1
    const val ALCHEMY_STATISTICS_TABLE = "alchemy_statistics_table"
}

object AlchemyStatisticsMapKeys {
    const val ALCHEMY_SLOT_INDEX = "alchemy_slot_index"
    const val ALCHEMY_GLOW_COLOR = "alchemy_glow_color"
    const val ALCHEMY_INSERT_DATE = "alchemy_insert_date"
}

object AlchemySlotIndexes {
    const val FIRST_SLOT_INDEX = "1"
    const val SECOND_SLOT_INDEX = "2"
    const val THIRD_SLOT_INDEX = "3"
    const val FOURTH_SLOT_INDEX = "4"
    const val FIFTH_SLOT_INDEX = "5"
}

object AlchemyGlowColors {
    const val GRAY_GLOW_COLOR = "gray_glow_color"
    const val BLUE_GLOW_COLOR = "blue_glow_color"
    const val GOLDEN_GLOW_COLOR = "golden_glow_color"
}