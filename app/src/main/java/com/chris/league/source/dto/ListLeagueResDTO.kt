package com.chris.league.source.dto

import com.squareup.moshi.Json

data class ListLeagueResDTO(
    @Json(name = "leagues")
    val leagues: List<LeagueResDTO>
)