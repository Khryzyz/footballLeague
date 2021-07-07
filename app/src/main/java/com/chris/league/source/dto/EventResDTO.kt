package com.chris.league.source.dto

import com.squareup.moshi.Json

data class EventResDTO(
    @Json(name = "results")
    val result: List<ResultEventResDTO>
)