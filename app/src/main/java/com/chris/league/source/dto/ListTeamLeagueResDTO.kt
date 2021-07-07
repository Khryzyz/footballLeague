package com.chris.league.source.dto

import com.squareup.moshi.Json

data class ListTeamLeagueResDTO(
    @Json(name = "teams")
    val teamResDTO: List<TeamResDTO>
)