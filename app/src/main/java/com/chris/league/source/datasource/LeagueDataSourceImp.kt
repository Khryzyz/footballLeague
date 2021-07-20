package com.chris.league.source.datasource

import com.chris.league.model.TeamModel
import com.chris.league.source.Api
import com.chris.league.utils.toListEventModel
import com.chris.league.utils.toListLeagueModel
import com.chris.league.utils.toListTeamModel
import com.chris.league.utils.uiState.UIStateListEvent
import com.chris.league.utils.uiState.UIStateListLeague
import com.chris.league.utils.uiState.UIStateListTeam
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LeagueDataSourceImp
@Inject constructor(
    private val api: Api
) : LeagueDataSource {

    override suspend fun getListTeam(leagueId: Int): Flow<UIStateListTeam> {
        return flow {
            emit(UIStateListTeam.Loading)
            val response = api.getListTeamByLeagueId(leagueId)
            if (response.isSuccessful) {
                response.body()?.let { leagueResDTO ->
                    emit(UIStateListTeam.Success(leagueResDTO.teamResDTO.toListTeamModel()))
                }
            } else {
                emit(UIStateListTeam.Error(response.errorBody().toString()))
            }
        }.catch {
            emit(UIStateListTeam.Error(it.toString()))
        }
    }

    override suspend fun getListLeague(): Flow<UIStateListLeague> {
        return flow {
            emit(UIStateListLeague.Loading)
            val response = api.getListLeague()
            if (response.isSuccessful) {
                response.body()?.let { listLeagueResDTO ->
                    emit(UIStateListLeague.Success(listLeagueResDTO.leagues.toListLeagueModel()))
                }
            } else {
                emit(UIStateListLeague.Error(response.errorBody().toString()))
            }
        }.catch {
            emit(UIStateListLeague.Error(it.toString()))
        }
    }

    override suspend fun getListEvent(teamModel: TeamModel): Flow<UIStateListEvent> {
        return flow {
            emit(UIStateListEvent.Loading)
            val response = api.getListEventByTeamId(teamModel.idTeam)
            if (response.isSuccessful) {
                response.body()?.let { eventResDTO ->
                    emit(UIStateListEvent.Success(eventResDTO.result.toListEventModel()))
                }
            } else {
                emit(UIStateListEvent.Error(response.errorBody().toString()))
            }
        }.catch {
            emit(UIStateListEvent.Error(it.toString()))
        }
    }
}