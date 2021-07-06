package com.chris.league.utils.uiState

sealed class UIStateData {
    object Loading : UIStateData()
    class Success(val data: Int) : UIStateData()
    class Error(val errorMessage: String) : UIStateData()
}