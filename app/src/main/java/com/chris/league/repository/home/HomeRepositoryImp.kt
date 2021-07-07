package com.chris.league.repository.home

import com.chris.league.source.datasource.LeagueDataSource
import com.chris.league.utils.uiState.UIStateListLeague
import com.chris.league.utils.uiState.UIStateListTeam
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImp @Inject constructor(
    private val leagueDataSource: LeagueDataSource
) : HomeRepository {

    override suspend fun getListTeam(leagueId: Int): Flow<UIStateListTeam> {
        return leagueDataSource.getListTeam(leagueId)
    }

    override suspend fun getListLeague(): Flow<UIStateListLeague> {
        return leagueDataSource.getListLeague()
    }

}
