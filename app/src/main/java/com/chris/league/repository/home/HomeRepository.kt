package com.chris.league.repository.home

import com.chris.league.utils.uiState.UIStateListLeague
import com.chris.league.utils.uiState.UIStateListTeam
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    suspend fun getListTeam(leagueId: Int): Flow<UIStateListTeam>
    suspend fun getListLeague(): Flow<UIStateListLeague>
}
