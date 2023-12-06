package com.semDev.l2m.notes.data.alchemy.repository

import androidx.compose.ui.graphics.Color
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyCombinationItem
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyResult
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyResultItem
import com.semDev.l2m.notes.domain.alchemy.repository.AlchemyCombinationsRepository
import com.semDev.l2m.notes.presentation.theme.Blue
import com.semDev.l2m.notes.utils.ImageAssets.GRACIA_MAGIC_STONE_ITEM
import com.semDev.l2m.notes.utils.ImageAssets.HEROIC_ITEM
import com.semDev.l2m.notes.utils.ImageAssets.LEGENDARY_ITEM
import com.semDev.l2m.notes.utils.ImageAssets.ORIGINAL_STONE_ITEM
import com.semDev.l2m.notes.utils.ImageAssets.PENDANT_ENCHANT_ITEM
import com.semDev.l2m.notes.utils.ImageAssets.PENDANT_STONE_ITEM
import com.semDev.l2m.notes.utils.ImageAssets.RARE_ITEM

class AlchemyCombinationsRepositoryImpl : AlchemyCombinationsRepository {
    override fun getNormalAlchemyCombinations(): List<AlchemyCombinations> {
        return listOf(
            AlchemyCombinations(
                alchemyStage = 1,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Green,
                            description = R.string.any_upgraded_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 2,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 3,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 4,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 5,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "1/0",
                            slotColor = Blue,
                            description = R.string.rare_1_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "1/0",
                            slotColor = Blue,
                            description = R.string.rare_1_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "6/6",
                            slotColor = Blue,
                            description = R.string.rare_6_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "6/6",
                            slotColor = Blue,
                            description = R.string.rare_6_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/w",
                            slotColor = Blue,
                            description = R.string.rare_7_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/4",
                            slotColor = Blue,
                            description = R.string.rare_5_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 6,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Blue,
                            description = R.string.rare_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "2/0",
                            slotColor = Blue,
                            description = R.string.rare_2_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "6/4",
                            slotColor = Blue,
                            description = R.string.rare_6_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "1/0",
                            slotColor = Blue,
                            description = R.string.rare_1_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "6/4",
                            slotColor = Blue,
                            description = R.string.rare_6_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "6/6",
                            slotColor = Blue,
                            description = R.string.rare_6_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 7,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Blue,
                            description = R.string.rare_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 8,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Blue,
                            description = R.string.rare_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "2/0",
                            slotColor = Blue,
                            description = R.string.rare_2_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = RARE_ITEM,
                            description = R.string.rune_or_rare_8_6_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 9,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Green,
                            description = R.string.any_upgraded_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Blue,
                            description = R.string.rare_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 10,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Blue,
                            description = R.string.rare_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Blue,
                            description = R.string.rare_3_0,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 11,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 12,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/w",
                            slotColor = Color.Red,
                            description = R.string.heroic_8_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Color.Red,
                            description = R.string.heroic_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 13,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/w",
                            slotColor = Color.Red,
                            description = R.string.heroic_8_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Color.Red,
                            description = R.string.heroic_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 14,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/w",
                            slotColor = Color.Red,
                            description = R.string.heroic_8_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Color.Red,
                            description = R.string.heroic_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 15,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 16,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 17,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Green,
                            description = R.string.any_upgraded_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 18,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 19,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "6/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_6_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Green,
                            description = R.string.any_upgraded_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 20,
                combinationItems = listOf(
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 21,
                combinationItems = listOf(
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 22,
                combinationItems = listOf(
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
        )
    }

    override fun getTopAlchemyCombinations(): List<AlchemyCombinations> {
        return listOf(
            AlchemyCombinations(
                alchemyStage = 1,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 2,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = GRACIA_MAGIC_STONE_ITEM,
                            description = R.string.gracia_magic_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = GRACIA_MAGIC_STONE_ITEM,
                            description = R.string.gracia_magic_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = PENDANT_ENCHANT_ITEM,
                            description = R.string.pendant_enchant_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 3,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    )
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = PENDANT_ENCHANT_ITEM,
                            description = R.string.pendant_enchant_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = PENDANT_STONE_ITEM,
                            description = R.string.pendant_stone_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 4,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "1/0",
                            slotColor = Blue,
                            description = R.string.rare_1_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "1/0",
                            slotColor = Blue,
                            description = R.string.rare_1_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "6/6",
                            slotColor = Blue,
                            description = R.string.rare_6_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "6/6",
                            slotColor = Blue,
                            description = R.string.rare_6_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/w",
                            slotColor = Blue,
                            description = R.string.rare_7_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/4",
                            slotColor = Blue,
                            description = R.string.rare_5_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = GRACIA_MAGIC_STONE_ITEM,
                            description = R.string.gracia_magic_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 5,
                combinationItems = listOf(
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = PENDANT_ENCHANT_ITEM,
                            description = R.string.pendant_enchant_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 6,
                combinationItems = listOf(

                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = null,
                            description = R.string.common_upgrade_rare_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 7,
                combinationItems = listOf(

                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = ORIGINAL_STONE_ITEM,
                            description = R.string.original_stone_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = PENDANT_ENCHANT_ITEM,
                            description = R.string.pendant_enchant_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 8,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = PENDANT_ENCHANT_ITEM,
                            description = R.string.pendant_enchant_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 9,
                combinationItems = listOf(
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 10,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Blue,
                            description = R.string.rare_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Blue,
                            description = R.string.rare_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Blue,
                            description = R.string.rare_3_0,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 11,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 12,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/w",
                            slotColor = Color.Red,
                            description = R.string.heroic_8_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Color.Red,
                            description = R.string.heroic_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 13,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/w",
                            slotColor = Color.Red,
                            description = R.string.heroic_8_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Color.Red,
                            description = R.string.heroic_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        )
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 14,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "8/w",
                            slotColor = Color.Red,
                            description = R.string.heroic_8_w,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "3/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_3_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "7/4",
                            slotColor = Color.Red,
                            description = R.string.heroic_7_4,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 15,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "8/6",
                            slotColor = Blue,
                            description = R.string.rare_8_6,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 16,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 17,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Blue,
                            description = R.string.any_rare_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "4/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_4_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 18,
                combinationItems = listOf(
                    listOf(
                        AlchemyCombinationItem(
                            itemEnchant = "5/0",
                            slotColor = Color.Red,
                            description = R.string.heroic_5_0,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.Red,
                            description = R.string.any_heroic_item,
                        ),
                        AlchemyCombinationItem(
                            itemEnchant = "",
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = LEGENDARY_ITEM,
                            description = R.string.legendary_item,
                        ),
                        AlchemyResultItem(
                            imageAssets = HEROIC_ITEM,
                            description = R.string.heroic_item,
                        ),
                    )
                ),
            ),
        )
    }
}