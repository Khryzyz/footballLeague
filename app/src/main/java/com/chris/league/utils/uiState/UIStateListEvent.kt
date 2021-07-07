package com.chris.league.utils.uiState

import com.chris.league.model.EventModel

sealed class UIStateListEvent {
    object Loading : UIStateListEvent()
    class Success(val data: List<EventModel>) : UIStateListEvent()
    class Error(val errorMessage: String) : UIStateListEvent()
}