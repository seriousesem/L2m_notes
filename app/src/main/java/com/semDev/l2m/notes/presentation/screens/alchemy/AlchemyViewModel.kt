package com.semDev.l2m.notes.presentation.screens.alchemy

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.viewModelScope
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.core.BaseViewModel
import com.semDev.l2m.notes.core.UiEvent
import com.semDev.l2m.notes.domain.alchemy.repository.AlchemyRepository
import com.semDev.l2m.notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m.notes.utils.MapKeys.MESSAGE_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlchemyViewModel @Inject constructor(
    private val repository: AlchemyRepository
) : BaseViewModel<AlchemyScreenEvent, AlchemyScreenState>() {

    private val _uiEvent = Channel<UiEvent>()

    init {
        getAlchemyCombinations(AlchemyType.NormalAlchemy())
    }

    override fun setInitialState(): AlchemyScreenState {
        return AlchemyScreenState(
            isLoading = true,
            alchemyCombinations = listOf(),
            alchemyType = AlchemyType.NormalAlchemy(),
            isShowDialog = false,
            combinationItemDescription = R.string.empty_slot,
        )
    }

    override fun <T> setEvent(event: AlchemyScreenEvent, data: T) {
        when (event) {
            AlchemyScreenEvent.SELECT_ALCHEMY_TYPE -> {
                val alchemyType = data as AlchemyType
                setState {
                    copy(
                        isLoading = true,
                        alchemyCombinations = this.alchemyCombinations,
                        alchemyType = alchemyType,
                        isShowDialog = this.isShowDialog,
                        combinationItemDescription = this.combinationItemDescription,
                    )
                }
                getAlchemyCombinations(alchemyType)
            }
            AlchemyScreenEvent.SHOW_SHORT_TOAST -> {
                val dataMap = data as Map<*, *>
                val context = dataMap[CONTEXT_KEY] as Context
                val message = dataMap[MESSAGE_KEY] as Int
                Toast.makeText(context, context.getText(message), Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

    private fun getAlchemyCombinations(alchemyType: AlchemyType) {
        if (alchemyType == AlchemyType.NormalAlchemy()) {
            setState {
                copy(
                    isLoading = false,
                    alchemyCombinations = repository.getNormalAlchemyCombinations(),
                    alchemyType = this.alchemyType,
                    isShowDialog = this.isShowDialog,
                    combinationItemDescription = this.combinationItemDescription,
                )
            }
        } else {
            setState {
                copy(
                    isLoading = false,
                    alchemyCombinations = repository.getTopAlchemyCombinations(),
                    alchemyType = this.alchemyType,
                    isShowDialog = this.isShowDialog,
                    combinationItemDescription = this.combinationItemDescription,
                )
            }
        }
    }

}