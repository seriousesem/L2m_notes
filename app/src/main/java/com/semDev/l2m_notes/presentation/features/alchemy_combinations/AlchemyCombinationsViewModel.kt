package com.semDev.l2m_notes.presentation.features.alchemy_combinations

import android.content.Context
import android.widget.Toast
import com.semDev.l2m_notes.core.AlchemyType
import com.semDev.l2m_notes.domain.repository.AlchemyCombinationsRepository
import com.semDev.l2m_notes.presentation.core.BaseViewModel
import com.semDev.l2m_notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m_notes.utils.MapKeys.MESSAGE_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AlchemyCombinationsViewModel @Inject constructor(
    private val repository: AlchemyCombinationsRepository
) : BaseViewModel<AlchemyCombinationsScreenEvent, AlchemyCombinationsScreenState>() {

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
    private fun getAlchemyCombinations(alchemyType: AlchemyType) {
        if (alchemyType == AlchemyType.NormalAlchemy()) {
            setState {
                copy(
                    isLoading = false,
                    alchemyCombinations = repository.fetchAlchemyCombinations(AlchemyType.NormalAlchemy()),
                    alchemyType = this.alchemyType,
                )
            }
        } else {
            setState {
                copy(
                    isLoading = false,
                    alchemyCombinations = repository.fetchAlchemyCombinations(AlchemyType.TopAlchemy()),
                    alchemyType = this.alchemyType,
                )
            }
        }

        AlchemyCombinationsScreenState().copyWith(
            isLoading = false,
            alchemyCombinations = null,
            alchemyType = null
        )
    }

}