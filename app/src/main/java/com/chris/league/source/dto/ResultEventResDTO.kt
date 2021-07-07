package com.chris.league.source.dto

import com.squareup.moshi.Json

data class ResultEventResDTO(
    @Json(name = "dateEvent")
    val dateEvent: String,

    @Json(name = "dateEventLocal")
    val dateEventLocal: String?,

    @Json(name = "idAPIfootball")
    val idAPIFootball: Int?,

    @Json(name = "idAwayTeam")
    val idAwayTeam: Int?,

    @Json(name = "idEvent")
    val idEvent: Int,

    @Json(name = "idHomeTeam")
    val idHomeTeam: Int?,

    @Json(name = "idLeague")
    val idLeague: Int?,

    @Json(name = "idSoccerXML")
    val idSoccerXML: Int?,

    @Json(name = "intAwayScore")
    val intAwayScore: Int?,

    @Json(name = "intAwayShots")
    val intAwayShots: Int?,

    @Json(name = "intHomeScore")
    val intHomeScore: Int?,

    @Json(name = "intHomeShots")
    val intHomeShots: Int?,

    @Json(name = "intRound")
    val intRound: Int?,

    @Json(name = "intSpectators")
    val intSpectators: Int?,

    @Json(name = "strAwayFormation")
    val strAwayFormation: String?,

    @Json(name = "strAwayGoalDetails")
    val strAwayGoalDetails: String?,

    @Json(name = "strAwayLineupDefense")
    val strAwayLineupDefense: String?,

    @Json(name = "strAwayLineupForward")
    val strAwayLineupForward: String?,

    @Json(name = "strAwayLineupGoalkeeper")
    val strAwayLineupGoalkeeper: String?,

    @Json(name = "strAwayLineupMidfield")
    val strAwayLineupMidfield: String?,

    @Json(name = "strAwayLineupSubstitutes")
    val strAwayLineupSubstitutes: String?,

    @Json(name = "strAwayRedCards")
    val strAwayRedCards: String?,

    @Json(name = "strAwayTeam")
    val strAwayTeam: String?,

    @Json(name = "strAwayYellowCards")
    val strAwayYellowCards: String?,

    @Json(name = "strBanner")
    val strBanner: String?,

    @Json(name = "strCity")
    val strCity: String?,

    @Json(name = "strCountry")
    val strCountry: String?,

    @Json(name = "strDescriptionEN")
    val strDescriptionEN: String?,

    @Json(name = "strEvent")
    val strEvent: String?,

    @Json(name = "strEventAlternate")
    val strEventAlternate: String?,

    @Json(name = "strFanart")
    val strFanart: String?,

    @Json(name = "strFilename")
    val strFilename: String?,

    @Json(name = "strHomeFormation")
    val strHomeFormation: String?,

    @Json(name = "strHomeGoalDetails")
    val strHomeGoalDetails: String?,

    @Json(name = "strHomeLineupDefense")
    val strHomeLineupDefense: String?,

    @Json(name = "strHomeLineupForward")
    val strHomeLineupForward: String?,

    @Json(name = "strHomeLineupGoalkeeper")
    val strHomeLineupGoalkeeper: String?,

    @Json(name = "strHomeLineupMidfield")
    val strHomeLineupMidfield: String?,

    @Json(name = "strHomeLineupSubstitutes")
    val strHomeLineupSubstitutes: String?,

    @Json(name = "strHomeRedCards")
    val strHomeRedCards: String?,

    @Json(name = "strHomeTeam")
    val strHomeTeam: String?,

    @Json(name = "strHomeYellowCards")
    val strHomeYellowCards: String?,

    @Json(name = "strLeague")
    val strLeague: String?,

    @Json(name = "strLocked")
    val strLocked: String?,

    @Json(name = "strMap")
    val strMap: String?,

    @Json(name = "strOfficial")
    val strOfficial: String?,

    @Json(name = "strPoster")
    val strPoster: String?,

    @Json(name = "strPostponed")
    val strPostponed: String?,

    @Json(name = "strResult")
    val strResult: String?,

    @Json(name = "strSeason")
    val strSeason: String?,

    @Json(name = "strSport")
    val strSport: String?,

    @Json(name = "strSquare")
    val strSquare: String?,

    @Json(name = "strStatus")
    val strStatus: String?,

    @Json(name = "strTVStation")
    val strTVStation: String?,

    @Json(name = "strThumb")
    val strThumb: String?,

    @Json(name = "strTime")
    val strTime: String?,

    @Json(name = "strTimeLocal")
    val strTimeLocal: String?,

    @Json(name = "strTimestamp")
    val strTimestamp: String?,

    @Json(name = "strTweet1")
    val strTweet1: String?,

    @Json(name = "strTweet2")
    val strTweet2: String?,

    @Json(name = "strTweet3")
    val strTweet3: String?,

    @Json(name = "strVenue")
    val strVenue: String?,

    @Json(name = "strVideo")
    val strVideo: String?
)