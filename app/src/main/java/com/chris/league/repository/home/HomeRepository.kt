package com.chris.league.repository.home

import com.chris.league.utils.uiState.UIStateData
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    suspend fun getData(leagueId: Int): Flow<UIStateData>
}
