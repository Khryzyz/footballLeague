package com.chris.league.utils.uiState

import com.chris.league.model.LeagueModel

sealed class UIStateListLeague {
    object Loading : UIStateListLeague()
    class Success(val data: List<LeagueModel>) : UIStateListLeague()
    class Error(val errorMessage: String) : UIStateListLeague()
}