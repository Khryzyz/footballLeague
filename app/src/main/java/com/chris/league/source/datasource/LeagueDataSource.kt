package com.chris.league.source.datasource

import com.chris.league.model.TeamModel
import com.chris.league.utils.uiState.UIStateListEvent
import com.chris.league.utils.uiState.UIStateListLeague
import com.chris.league.utils.uiState.UIStateListTeam
import kotlinx.coroutines.flow.Flow

interface LeagueDataSource {
    suspend fun getListTeam(leagueId: Int): Flow<UIStateListTeam>
    suspend fun getListLeague(): Flow<UIStateListLeague>
    suspend fun getListEvent(teamModel: TeamModel): Flow<UIStateListEvent>
}