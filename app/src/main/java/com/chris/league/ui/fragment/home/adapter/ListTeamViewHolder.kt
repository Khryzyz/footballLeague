package com.chris.league.ui.fragment.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chris.league.databinding.ItemListTeamBinding
import com.chris.league.model.TeamModel

class ListTeamViewHolder(private val binding: ItemListTeamBinding) :
    RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(
            parent: ViewGroup
        ): ListTeamViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemListTeamBinding.inflate(
                layoutInflater,
                parent,
                false
            )
            return ListTeamViewHolder(binding)
        }
    }

    fun bind(
        item: TeamModel,
        clickItemTeam: ClickItemTeam
    ) {
        binding.apply {
            this.teamModel = item
            this.clickItemTeam = clickItemTeam
            executePendingBindings()
        }
    }

}