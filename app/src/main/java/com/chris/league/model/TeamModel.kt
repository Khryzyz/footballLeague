package com.chris.league.model

import androidx.recyclerview.widget.DiffUtil
import java.io.Serializable

data class TeamModel(

    val idTeam: Int,

    val idAPIFootball: Int,

    val idLeague: Int,
    val idLeague2: Int = 0,
    val idLeague3: Int = 0,
    val idLeague4: Int = 0,
    val idLeague5: Int = 0,
    val idLeague6: Int = 0,
    val idLeague7: Int = 0,

    val idSoccerXML: Int,

    val intFormedYear: Int,

    val intLoved: Int = 0,

    val intStadiumCapacity: Int,

    val strAlternate: String = "",

    val strCountry: String = "",

    val strDescriptionCN: String = "",
    val strDescriptionDE: String = "",
    val strDescriptionEN: String = "",
    val strDescriptionES: String = "",
    val strDescriptionFR: String = "",
    val strDescriptionHU: String = "",
    val strDescriptionIL: String = "",
    val strDescriptionIT: String = "",
    val strDescriptionJP: String = "",
    val strDescriptionNL: String = "",
    val strDescriptionNO: String = "",
    val strDescriptionPL: String = "",
    val strDescriptionPT: String = "",
    val strDescriptionRU: String = "",
    val strDescriptionSE: String = "",

    val strDivision: String = "",

    val strFacebook: String = "",

    val strGender: String = "",

    val strInstagram: String = "",

    val strKeywords: String = "",

    val strLeague: String = "",
    val strLeague2: String = "",
    val strLeague3: String = "",
    val strLeague4: String = "",
    val strLeague5: String = "",
    val strLeague6: String = "",
    val strLeague7: String = "",

    val strLocked: String = "",

    val strManager: String = "",

    val strRSS: String = "",

    val strSport: String = "",

    val strStadium: String = "",

    val strStadiumDescription: String = "",

    val strStadiumLocation: String = "",

    val strStadiumThumb: String = "",

    val strTeam: String = "",
    val strTeamBadge: String = "",
    val strTeamBanner: String = "",
    val strTeamFanart1: String = "",
    val strTeamFanart2: String = "",
    val strTeamFanart3: String = "",
    val strTeamFanart4: String = "",
    val strTeamJersey: String = "",
    val strTeamLogo: String = "",
    val strTeamShort: String = "",
    val strTwitter: String = "",
    val strWebsite: String = "",
    val strYoutube: String = "",
) : Serializable {

    companion object {

        val DiffCallBack = object : DiffUtil.ItemCallback<TeamModel>() {

            override fun areItemsTheSame(oldItem: TeamModel, newItem: TeamModel) =
                oldItem.idTeam == newItem.idTeam

            override fun areContentsTheSame(
                oldItem: TeamModel,
                newItem: TeamModel
            ) =
                oldItem == newItem

        }

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TeamModel

        if (idTeam != other.idTeam) return false

        return true
    }

    override fun hashCode(): Int {
        return idTeam
    }

}