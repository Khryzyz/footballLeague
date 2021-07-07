package com.chris.league.source.dto

import com.squareup.moshi.Json

data class TeamResDTO(

    @Json(name = "idAPIfootball")
    val idAPIFootball: Int,

    @Json(name = "idLeague")
    val idLeague: Int,

    @Json(name = "idLeague2")
    val idLeague2: Int?,

    @Json(name = "idLeague3")
    val idLeague3: Int?,

    @Json(name = "idLeague4")
    val idLeague4: Int?,

    @Json(name = "idLeague5")
    val idLeague5: Int?,

    @Json(name = "idLeague6")
    val idLeague6: Int?,

    @Json(name = "idLeague7")
    val idLeague7: Int?,

    @Json(name = "idSoccerXML")
    val idSoccerXML: Int?,

    @Json(name = "idTeam")
    val idTeam: Int,

    @Json(name = "intFormedYear")
    val intFormedYear: Int,

    @Json(name = "intLoved")
    val intLoved: Int?,

    @Json(name = "intStadiumCapacity")
    val intStadiumCapacity: Int,

    @Json(name = "strAlternate")
    val strAlternate: String?,

    @Json(name = "strCountry")
    val strCountry: String?,

    @Json(name = "strDescriptionCN")
    val strDescriptionCN: String?,

    @Json(name = "strDescriptionDE")
    val strDescriptionDE: String?,

    @Json(name = "strDescriptionEN")
    val strDescriptionEN: String?,

    @Json(name = "strDescriptionES")
    val strDescriptionES: String?,

    @Json(name = "strDescriptionFR")
    val strDescriptionFR: String?,

    @Json(name = "strDescriptionHU")
    val strDescriptionHU: String?,

    @Json(name = "strDescriptionIL")
    val strDescriptionIL: String?,

    @Json(name = "strDescriptionIT")
    val strDescriptionIT: String?,

    @Json(name = "strDescriptionJP")
    val strDescriptionJP: String?,

    @Json(name = "strDescriptionNL")
    val strDescriptionNL: String?,

    @Json(name = "strDescriptionNO")
    val strDescriptionNO: String?,

    @Json(name = "strDescriptionPL")
    val strDescriptionPL: String?,

    @Json(name = "strDescriptionPT")
    val strDescriptionPT: String?,

    @Json(name = "strDescriptionRU")
    val strDescriptionRU: String?,

    @Json(name = "strDescriptionSE")
    val strDescriptionSE: String?,

    @Json(name = "strDivision")
    val strDivision: String?,

    @Json(name = "strFacebook")
    val strFacebook: String?,

    @Json(name = "strGender")
    val strGender: String?,

    @Json(name = "strInstagram")
    val strInstagram: String?,

    @Json(name = "strKeywords")
    val strKeywords: String?,

    @Json(name = "strLeague")
    val strLeague: String?,

    @Json(name = "strLeague2")
    val strLeague2: String?,

    @Json(name = "strLeague3")
    val strLeague3: String?,

    @Json(name = "strLeague4")
    val strLeague4: String?,

    @Json(name = "strLeague5")
    val strLeague5: String?,

    @Json(name = "strLeague6")
    val strLeague6: String?,

    @Json(name = "strLeague7")
    val strLeague7: String?,

    @Json(name = "strLocked")
    val strLocked: String?,

    @Json(name = "strManager")
    val strManager: String?,

    @Json(name = "strRSS")
    val strRSS: String?,

    @Json(name = "strSport")
    val strSport: String?,

    @Json(name = "strStadium")
    val strStadium: String?,

    @Json(name = "strStadiumDescription")
    val strStadiumDescription: String?,

    @Json(name = "strStadiumLocation")
    val strStadiumLocation: String?,

    @Json(name = "strStadiumThumb")
    val strStadiumThumb: String?,

    @Json(name = "strTeam")
    val strTeam: String?,

    @Json(name = "strTeamBadge")
    val strTeamBadge: String?,

    @Json(name = "strTeamBanner")
    val strTeamBanner: String?,

    @Json(name = "strTeamFanart1")
    val strTeamFanart1: String?,

    @Json(name = "strTeamFanart2")
    val strTeamFanart2: String?,

    @Json(name = "strTeamFanart3")
    val strTeamFanart3: String?,

    @Json(name = "strTeamFanart4")
    val strTeamFanart4: String?,

    @Json(name = "strTeamJersey")
    val strTeamJersey: String?,

    @Json(name = "strTeamLogo")
    val strTeamLogo: String?,

    @Json(name = "strTeamShort")
    val strTeamShort: String?,

    @Json(name = "strTwitter")
    val strTwitter: String?,

    @Json(name = "strWebsite")
    val strWebsite: String?,

    @Json(name = "strYoutube")
    val strYoutube: String?,

    )