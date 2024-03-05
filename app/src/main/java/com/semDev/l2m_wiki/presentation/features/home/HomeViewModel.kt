package com.semDev.l2m_wiki.presentation.features.home

import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
) : BaseViewModel<HomeScreenEvent, HomeScreenState>() {

    override fun setInitialState(): HomeScreenState {
        return HomeScreenState()
    }


    override fun <T> setEvent(event: HomeScreenEvent, data: T) {
        when (event) {
            HomeScreenEvent.GO_TO_ALCHEMY_COMBINATIONS_SCREEN -> {

            }

            HomeScreenEvent.GO_TO_ALCHEMY_STATISTICS_SCREEN -> {

            }
        }
    }
}

