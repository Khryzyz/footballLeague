package com.chris.league.source.datasource

import com.chris.league.source.Api
import com.chris.league.utils.toListTeamModel
import com.chris.league.utils.uiState.UIStateData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LeagueDataSourceImp
@Inject constructor(
    private val api: Api
) : LeagueDataSource {

    override suspend fun getData(leagueId: Int): Flow<UIStateData> {
        return flow {
            try {
                emit(UIStateData.Loading)
                val response = api.getData(leagueId)
                if (response.isSuccessful) {
                    response.body()?.let { leagueResDTO ->
                        emit(UIStateData.Success(leagueResDTO.teamResDTO.toListTeamModel()))
                    }
                } else {
                    emit(UIStateData.Error(response.errorBody()!!.toString()))
                }
            } catch (e: Exception) {
                emit(UIStateData.Error(e.toString()))
            }
        }
    }

}