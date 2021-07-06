package com.chris.league.repository.home

import com.chris.league.source.datasource.LeagueDataSource
import com.chris.league.utils.uiState.UIStateData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImp @Inject constructor(
    private val leagueDataSource: LeagueDataSource
) : HomeRepository {

    override suspend fun getData(leagueId: Int): Flow<UIStateData> {
        return leagueDataSource.getData(leagueId)
    }

}
