package com.semDev.l2m.notes.data.alchemy.repository

import androidx.compose.ui.graphics.Color
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyCombinations
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyCombinationItem
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyResult
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyResultItem
import com.semDev.l2m.notes.domain.alchemy.repository.AlchemyRepository
import com.semDev.l2m.notes.presentation.theme.Blue

class AlchemyRepositoryImpl : AlchemyRepository {
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = null
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = null
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png"
                        ),
                        AlchemyResultItem(
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = null
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            slotColor = Color.LightGray,
                            description = R.string.empty_slot,
                        ),
                    ),
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
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
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 20,
                combinationItems = listOf(
                    listOf()
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 21,
                combinationItems = listOf(
                    listOf()
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                    )
                ),
            ),
            AlchemyCombinations(
                alchemyStage = 22,
                combinationItems = listOf(
                    listOf()
                ),
                alchemyResult = AlchemyResult(
                    items = listOf(
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_legendary_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                        AlchemyResultItem(
                            item = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_misc_craft_prob_add_epic_01.png"
                        ),
                    )
                ),
            ),
        )
    }

    override fun getTopAlchemyCombinations(): List<AlchemyCombinations> {
        return listOf()
    }
}