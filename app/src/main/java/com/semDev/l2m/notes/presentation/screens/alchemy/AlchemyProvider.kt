package com.semDev.l2m.notes.presentation.screens.alchemy

import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.core.ViewEvent
import com.semDev.l2m.notes.core.ViewState

class AlchemyProvider {

    enum class Event: ViewEvent{
        SHOW_DIALOG, CLOSE_DIALOG, SELECT_ALCHEMY_STAGE, OPEN_DROPDOWN, CLOSE_DROPDOWN
    }

    data class State(
        val isShowDialog: Boolean = false,
        val isLoading: Boolean = false,
        val alchemyInsertSlotDescription: Int = R.string.empty_slot,
        val selectedAlchemyStage: String = "1",
        val isDropdownOpen: Boolean = false,
    ): ViewState
}