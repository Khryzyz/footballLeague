package com.chris.league.model

import androidx.recyclerview.widget.DiffUtil
import java.io.Serializable

data class LeagueModel(

    val idLeague: Int,
    val strLeague: String,
    val strLeagueAlternate: String,
    val strSport: String
) : Serializable {

    companion object {

        val DiffCallBack = object : DiffUtil.ItemCallback<LeagueModel>() {

            override fun areItemsTheSame(oldItem: LeagueModel, newItem: LeagueModel) =
                oldItem.idLeague == newItem.idLeague

            override fun areContentsTheSame(
                oldItem: LeagueModel,
                newItem: LeagueModel
            ) =
                oldItem == newItem

        }

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LeagueModel

        if (idLeague != other.idLeague) return false

        return true
    }

    override fun hashCode(): Int {
        return idLeague
    }

}