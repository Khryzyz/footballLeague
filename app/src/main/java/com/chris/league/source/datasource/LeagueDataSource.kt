package com.chris.league.source.datasource

import com.chris.league.utils.uiState.UIStateData
import kotlinx.coroutines.flow.Flow

interface LeagueDataSource {
    suspend fun getData(leagueId:Int): Flow<UIStateData>
}