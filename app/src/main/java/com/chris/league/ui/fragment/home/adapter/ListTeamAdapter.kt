package com.chris.league.ui.fragment.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.chris.league.model.TeamModel

class ListTeamAdapter() :
    ListAdapter<TeamModel, ListTeamViewHolder>(TeamModel.DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTeamViewHolder {
        return ListTeamViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ListTeamViewHolder, position: Int) {
        val team = getItem(position)
        holder.bind(
            team
        )
    }

}