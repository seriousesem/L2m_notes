package com.semDev.l2m.notes.presentation.screens.alchemy

import androidx.compose.ui.graphics.Color
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.core.BaseViewModel
import com.semDev.l2m.notes.domain.model.alchemy.AlchemyInsertCombinationItemModel
import com.semDev.l2m.notes.domain.model.alchemy.AlchemyInsertCombinationModel
import com.semDev.l2m.notes.presentation.theme.Blue
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AlchemyViewModel @Inject constructor(

) :
    BaseViewModel<AlchemyProvider.Event, AlchemyProvider.State>() {

    val slotsCombination = listOf(
        AlchemyInsertCombinationModel(
            alchemyInsertCombinationItems = listOf(
                AlchemyInsertCombinationItemModel(
                    itemEnchant = "",
                    slotColor = Blue,
                    description = R.string.any_rare_item,
                ),
                AlchemyInsertCombinationItemModel(
                    itemEnchant = "",
                    slotColor = Blue,
                    description = R.string.any_rare_item,
                ),
                AlchemyInsertCombinationItemModel(
                    itemEnchant = "",
                    slotColor = Color.Green,
                    description = R.string.any_upgraded_item,
                ),
                AlchemyInsertCombinationItemModel(
                    itemEnchant = "",
                    slotColor = Color.LightGray,
                    description = R.string.empty_slot,
                ),
                AlchemyInsertCombinationItemModel(
                    itemEnchant = "",
                    slotColor = Color.LightGray,
                    description = R.string.empty_slot,
                )
            ),
        )

    )
    val simplyAlchemyStages = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12")


    override fun setInitialState(): AlchemyProvider.State {
        return AlchemyProvider.State(
            isShowDialog = false,
            isLoading = false,
            alchemyInsertSlotDescription = R.string.empty_slot,
            selectedAlchemyStage = "1",
            isDropdownOpen = false,
        )
    }

    override fun <T> setEvent(event: AlchemyProvider.Event, data: T) {
        when (event) {
            AlchemyProvider.Event.SHOW_DIALOG -> {
                val description = data as Int
                showDialog(description)
            }

            AlchemyProvider.Event.CLOSE_DIALOG -> {
                closeDialog()
            }

            AlchemyProvider.Event.SELECT_ALCHEMY_STAGE -> {
                val alchemyStage = data as String
                selectAlchemyStage(alchemyStage = alchemyStage)
            }

            AlchemyProvider.Event.OPEN_DROPDOWN -> {
                openDropdown()
            }

            AlchemyProvider.Event.CLOSE_DROPDOWN -> {
                closeDropdown()
            }
        }
    }

    private fun showDialog(description: Int) {
        setState {
            AlchemyProvider.State(
                isShowDialog = true,
                isLoading = this.isLoading,
                alchemyInsertSlotDescription = description,
                selectedAlchemyStage = this.selectedAlchemyStage,
                isDropdownOpen = this.isDropdownOpen,
            )
        }
    }

    private fun closeDialog() {
        setState {
            AlchemyProvider.State(
                isShowDialog = false,
                isLoading = this.isLoading,
                alchemyInsertSlotDescription = this.alchemyInsertSlotDescription,
                selectedAlchemyStage = this.selectedAlchemyStage,
                isDropdownOpen = this.isDropdownOpen,
            )
        }
    }

    private fun selectAlchemyStage(alchemyStage: String) {
        setState {
            AlchemyProvider.State(
                isShowDialog = this.isShowDialog,
                isLoading = this.isLoading,
                alchemyInsertSlotDescription = this.alchemyInsertSlotDescription,
                selectedAlchemyStage = alchemyStage,
                isDropdownOpen = false,
            )
        }
    }

    private fun openDropdown() {
        setState {
            AlchemyProvider.State(
                isShowDialog = this.isShowDialog,
                isLoading = this.isLoading,
                alchemyInsertSlotDescription = this.alchemyInsertSlotDescription,
                selectedAlchemyStage = this.selectedAlchemyStage,
                isDropdownOpen = true,
            )
        }
    }

    private fun closeDropdown() {
        setState {
            AlchemyProvider.State(
                isShowDialog = this.isShowDialog,
                isLoading = this.isLoading,
                alchemyInsertSlotDescription = this.alchemyInsertSlotDescription,
                selectedAlchemyStage = this.selectedAlchemyStage,
                isDropdownOpen = false,
            )
        }
    }


}