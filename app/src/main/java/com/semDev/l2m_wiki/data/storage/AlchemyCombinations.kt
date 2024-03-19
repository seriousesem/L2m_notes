package com.semDev.l2m_wiki.data.storage

import androidx.compose.ui.graphics.Color
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinationItem
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinationResultItem
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinationResults
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m_wiki.presentation.theme.DarkBlue
import com.semDev.l2m_wiki.presentation.theme.Green
import com.semDev.l2m_wiki.presentation.theme.LiteGray
import com.semDev.l2m_wiki.presentation.theme.Red
import com.semDev.l2m_wiki.utils.ImageAssets
object AlchemyCombinationsList {

    val normalAlchemyCombinations = listOf(
        AlchemyCombinations(
            alchemyStage = 1,
            combinationItems = listOf(
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Green,
                        description = R.string.any_upgraded_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_1_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "1/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_1_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "6/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "6/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/w",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "5/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_5_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "2/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_2_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "6/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "1/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_1_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "6/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "6/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "1/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_1_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "5/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "5/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "2/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_2_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.RARE_ITEM,
                        description = R.string.rune_or_rare_8_6_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Green,
                        description = R.string.any_upgraded_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "5/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = Red,
                        description = R.string.heroic_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = Red,
                        description = R.string.heroic_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = Red,
                        description = R.string.heroic_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/w",
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Color.Green,
                        description = R.string.any_upgraded_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_6_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Color.Green,
                        description = R.string.any_upgraded_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                )
            ),
        ),
//        AlchemyCombinations(
//            alchemyStage = 20,
//            combinationItems = listOf(
//            ),
//            alchemyCombinationResults = AlchemyCombinationResults(
//                items = listOf(
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.LEGENDARY_ITEM,
//                        description = R.string.legendary_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.LEGENDARY_ITEM,
//                        description = R.string.legendary_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                )
//            ),
//        ),
//        AlchemyCombinations(
//            alchemyStage = 21,
//            combinationItems = listOf(
//            ),
//            alchemyCombinationResults = AlchemyCombinationResults(
//                items = listOf(
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.LEGENDARY_ITEM,
//                        description = R.string.legendary_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                )
//            ),
//        ),
//        AlchemyCombinations(
//            alchemyStage = 22,
//            combinationItems = listOf(
//            ),
//            alchemyCombinationResults = AlchemyCombinationResults(
//                items = listOf(
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.LEGENDARY_ITEM,
//                        description = R.string.legendary_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                    AlchemyCombinationResultItem(
//                        imageAssets = ImageAssets.HEROIC_ITEM,
//                        description = R.string.heroic_item,
//                    ),
//                )
//            ),
//        ),
    )

    val topAlchemyCombinations = listOf(
        AlchemyCombinations(
            alchemyStage = 1,
            combinationItems = listOf(
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.GRACIA_MAGIC_STONE_ITEM,
                        description = R.string.gracia_magic_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.GRACIA_MAGIC_STONE_ITEM,
                        description = R.string.gracia_magic_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.PENDANT_ENCHANT_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                )
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.PENDANT_ENCHANT_ITEM,
                        description = R.string.pendant_enchant_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.PENDANT_STONE_ITEM,
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
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_1_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "1/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_1_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "6/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "6/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_6_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/w",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "5/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_5_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.GRACIA_MAGIC_STONE_ITEM,
                        description = R.string.gracia_magic_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                )
            ),
        ),
        AlchemyCombinations(
            alchemyStage = 5,
            combinationItems = listOf(
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.PENDANT_ENCHANT_ITEM,
                        description = R.string.pendant_enchant_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                )
            ),
        ),
        AlchemyCombinations(
            alchemyStage = 6,
            combinationItems = listOf(

            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = null,
                        description = R.string.common_upgrade_rare_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                )
            ),
        ),
        AlchemyCombinations(
            alchemyStage = 7,
            combinationItems = listOf(

            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.ORIGINAL_STONE_ITEM,
                        description = R.string.original_stone_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.PENDANT_ENCHANT_ITEM,
                        description = R.string.pendant_enchant_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.PENDANT_ENCHANT_ITEM,
                        description = R.string.pendant_enchant_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                )
            ),
        ),
        AlchemyCombinations(
            alchemyStage = 9,
            combinationItems = listOf(
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_3_0,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = Red,
                        description = R.string.heroic_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = Red,
                        description = R.string.heroic_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    )
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_8_w,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "3/0",
                        slotColor = Red,
                        description = R.string.heroic_3_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "7/4",
                        slotColor = Red,
                        description = R.string.heroic_7_4,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "8/6",
                        slotColor = DarkBlue
                        ,
                        description = R.string.rare_8_6,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = DarkBlue
                        ,
                        description = R.string.any_rare_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
                listOf(
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "4/0",
                        slotColor = Red,
                        description = R.string.heroic_4_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
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
                        slotColor = Red,
                        description = R.string.heroic_5_0,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = Red,
                        description = R.string.any_heroic_item,
                    ),
                    AlchemyCombinationItem(
                        itemEnchant = "",
                        slotColor = LiteGray,
                        description = R.string.empty_slot,
                    ),
                ),
            ),
            alchemyCombinationResults = AlchemyCombinationResults(
                items = listOf(
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.LEGENDARY_ITEM,
                        description = R.string.legendary_item,
                    ),
                    AlchemyCombinationResultItem(
                        imageAssets = ImageAssets.HEROIC_ITEM,
                        description = R.string.heroic_item,
                    ),
                )
            ),
        ),
    )
}