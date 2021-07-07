package com.chris.league.repository.event

import com.chris.league.model.TeamModel
import com.chris.league.utils.uiState.UIStateListEvent
import kotlinx.coroutines.flow.Flow

interface EventRepository {
    suspend fun getListEvent(teamModel: TeamModel): Flow<UIStateListEvent>
}
