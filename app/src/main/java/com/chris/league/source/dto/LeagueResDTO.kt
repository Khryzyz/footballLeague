package com.chris.league.source.dto

import com.squareup.moshi.Json

data class LeagueResDTO(
    @Json(name = "idLeague")
    val idLeague: Int,

    @Json(name = "strLeague")
    val strLeague: String,

    @Json(name = "strLeagueAlternate")
    val strLeagueAlternate: String?,

    @Json(name = "strSport")
    val strSport: String
)