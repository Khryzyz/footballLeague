package com.chris.league.source

import com.chris.league.source.dto.LeagueResDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET(ApiConstants.EndPoint.DATA)
    suspend fun getData(@Query("id") leagueId: Int): Response<LeagueResDTO>
}