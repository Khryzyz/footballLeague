package com.chris.league.source.datasource

import com.chris.league.model.TeamModel
import com.chris.league.source.Api
import com.chris.league.utils.toListEventModel
import com.chris.league.utils.toListTeamModel
import com.chris.league.utils.uiState.UIStateListEvent
import com.chris.league.utils.uiState.UIStateListTeam
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LeagueDataSourceImp
@Inject constructor(
    private val api: Api
) : LeagueDataSource {

    override suspend fun getListTeam(leagueId: Int): Flow<UIStateListTeam> {
        return flow {
            try {
                emit(UIStateListTeam.Loading)
                val response = api.getListTeamByLeagueId(leagueId)
                if (response.isSuccessful) {
                    response.body()?.let { leagueResDTO ->
                        emit(UIStateListTeam.Success(leagueResDTO.teamResDTO.toListTeamModel()))
                    }
                } else {
                    emit(UIStateListTeam.Error(response.errorBody()!!.toString()))
                }
            } catch (e: Exception) {
                emit(UIStateListTeam.Error(e.toString()))
            }
        }
    }

    override suspend fun getListEvent(teamModel: TeamModel): Flow<UIStateListEvent> {
        return flow {
            try {
                emit(UIStateListEvent.Loading)
                val response = api.getListEventByTeamId(teamModel.idTeam)
                if (response.isSuccessful) {
                    response.body()?.let { eventResDTO ->
                        emit(UIStateListEvent.Success(eventResDTO.result.toListEventModel()))
                    }
                } else {
                    emit(UIStateListEvent.Error(response.errorBody()!!.toString()))
                }
            } catch (e: Exception) {
                emit(UIStateListEvent.Error(e.toString()))
            }
        }
    }

}