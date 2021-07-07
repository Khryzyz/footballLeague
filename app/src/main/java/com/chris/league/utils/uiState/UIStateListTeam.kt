package com.chris.league.utils.uiState

import com.chris.league.model.TeamModel

sealed class UIStateListTeam {
    object Loading : UIStateListTeam()
    class Success(val data: List<TeamModel>) : UIStateListTeam()
    class Error(val errorMessage: String) : UIStateListTeam()
}