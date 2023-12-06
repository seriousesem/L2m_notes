package com.semDev.l2m.notes.presentation.screens.alchemy_combinations

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.viewModelScope
import com.semDev.l2m.notes.core.BaseViewModel
import com.semDev.l2m.notes.core.UiEvent
import com.semDev.l2m.notes.domain.alchemy.repository.AlchemyCombinationsRepository
import com.semDev.l2m.notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m.notes.utils.MapKeys.MESSAGE_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlchemyCombinationsViewModel @Inject constructor(
    private val repository: AlchemyCombinationsRepository
) : BaseViewModel<AlchemyCombinationsScreenEvent, AlchemyCombinationsScreenState>() {

    private val _uiEvent = Channel<UiEvent>()

    init {
        getAlchemyCombinations(AlchemyType.NormalAlchemy())
    }

    override fun setInitialState(): AlchemyCombinationsScreenState {
        return AlchemyCombinationsScreenState(
            isLoading = true,
            alchemyCombinations = listOf(),
            alchemyType = AlchemyType.NormalAlchemy(),
        )
    }

    override fun <T> setEvent(event: AlchemyCombinationsScreenEvent, data: T) {
        when (event) {
            AlchemyCombinationsScreenEvent.SELECT_ALCHEMY_TYPE -> {
                val alchemyType = data as AlchemyType
                setState {
                    copy(
                        isLoading = true,
                        alchemyCombinations = this.alchemyCombinations,
                        alchemyType = alchemyType,
                    )
                }
                getAlchemyCombinations(alchemyType)
            }
            AlchemyCombinationsScreenEvent.SHOW_SHORT_TOAST -> {
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
                )
            }
        } else {
            setState {
                copy(
                    isLoading = false,
                    alchemyCombinations = repository.getTopAlchemyCombinations(),
                    alchemyType = this.alchemyType,
                )
            }
        }
    }

}