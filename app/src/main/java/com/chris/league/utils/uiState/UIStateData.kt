package com.chris.league.utils.uiState

import com.chris.league.model.TeamModel

sealed class UIStateData {
    object Loading : UIStateData()
    class Success(val data: List<TeamModel>) : UIStateData()
    class Error(val errorMessage: String) : UIStateData()
}