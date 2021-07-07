package com.chris.league.model

import androidx.recyclerview.widget.DiffUtil
import java.io.Serializable

data class EventModel(

    val idEvent: Int,
    val dateEvent: String,
    val dateEventLocal: String,
    val idAPIFootball: Int = 0,
    val idAwayTeam: Int = 0,
    val idHomeTeam: Int = 0,
    val idLeague: Int = 0,
    val idSoccerXML: Int = 0,
    val intAwayScore: Int = 0,
    val intAwayShots: Int = 0,
    val intHomeScore: Int = 0,
    val intHomeShots: Int = 0,
    val intRound: Int = 0,
    val intSpectators: Int = 0,
    val strAwayFormation: String = "",
    val strAwayGoalDetails: String = "",
    val strAwayLineupDefense: String = "",
    val strAwayLineupForward: String = "",
    val strAwayLineupGoalkeeper: String = "",
    val strAwayLineupMidfield: String = "",
    val strAwayLineupSubstitutes: String = "",
    val strAwayRedCards: String = "",
    val strAwayTeam: String = "",
    val strAwayYellowCards: String = "",
    val strBanner: String = "",
    val strCity: String = "",
    val strCountry: String = "",
    val strDescriptionEN: String = "",
    val strEvent: String = "",
    val strEventAlternate: String = "",
    val strFanart: String = "",
    val strFilename: String = "",
    val strHomeFormation: String = "",
    val strHomeGoalDetails: String = "",
    val strHomeLineupDefense: String = "",
    val strHomeLineupForward: String = "",
    val strHomeLineupGoalkeeper: String = "",
    val strHomeLineupMidfield: String = "",
    val strHomeLineupSubstitutes: String = "",
    val strHomeRedCards: String = "",
    val strHomeTeam: String = "",
    val strHomeYellowCards: String = "",
    val strLeague: String = "",
    val strLocked: String = "",
    val strMap: String = "",
    val strOfficial: String = "",
    val strPoster: String = "",
    val strPostponed: String = "",
    val strResult: String = "",
    val strSeason: String = "",
    val strSport: String = "",
    val strSquare: String = "",
    val strStatus: String = "",
    val strTVStation: String = "",
    val strThumb: String = "",
    val strTime: String = "",
    val strTimeLocal: String = "",
    val strTimestamp: String = "",
    val strTweet1: String = "",
    val strTweet2: String = "",
    val strTweet3: String = "",
    val strVenue: String = "",
    val strVideo: String?
) : Serializable {

    companion object {

        val DiffCallBack = object : DiffUtil.ItemCallback<EventModel>() {

            override fun areItemsTheSame(oldItem: EventModel, newItem: EventModel) =
                oldItem.idEvent == newItem.idEvent

            override fun areContentsTheSame(
                oldItem: EventModel,
                newItem: EventModel
            ) =
                oldItem == newItem

        }

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as EventModel

        if (idEvent != other.idEvent) return false

        return true
    }

    override fun hashCode(): Int {
        return idEvent
    }

}