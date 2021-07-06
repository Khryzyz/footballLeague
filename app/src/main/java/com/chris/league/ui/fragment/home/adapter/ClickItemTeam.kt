package com.chris.league.ui.fragment.home.adapter

import com.chris.league.model.TeamModel

interface ClickItemTeam {
    fun onClickNavigateDetail(teamModel: TeamModel)
}