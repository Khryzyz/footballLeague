package com.chris.league.source

import com.chris.league.source.dto.EventResDTO
import com.chris.league.source.dto.ListLeagueResDTO
import com.chris.league.source.dto.ListTeamLeagueResDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET(ApiConstants.EndPoint.GET_LIST_TEAM_BY_LEAGUE_ID)
    suspend fun getListTeamByLeagueId(@Query("id") leagueId: Int): Response<ListTeamLeagueResDTO>

    @GET(ApiConstants.EndPoint.GET_LIST_LEAGUE)
    suspend fun getListLeague(): Response<ListLeagueResDTO>

    @GET(ApiConstants.EndPoint.GET_LIST_EVENT_BY_TEAM_ID)
    suspend fun getListEventByTeamId(@Query("id") teamId: Int): Response<EventResDTO>
}