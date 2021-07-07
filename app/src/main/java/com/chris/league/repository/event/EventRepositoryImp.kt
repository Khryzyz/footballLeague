package com.chris.league.repository.event

import com.chris.league.model.TeamModel
import com.chris.league.source.datasource.LeagueDataSource
import com.chris.league.utils.uiState.UIStateListEvent
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EventRepositoryImp @Inject constructor(
    private val leagueDataSource: LeagueDataSource
) : EventRepository {

    override suspend fun getListEvent(teamModel: TeamModel): Flow<UIStateListEvent> {
        return leagueDataSource.getListEvent(teamModel)
    }

}
