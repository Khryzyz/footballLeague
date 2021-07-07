package com.chris.league.source

object ApiConstants {
    const val BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/"

    object EndPoint {
        const val GET_LIST_TEAM_BY_LEAGUE_ID = "lookup_all_teams.php?"
        const val GET_LIST_EVENT_BY_TEAM_ID = "eventslast.php?"
    }
}