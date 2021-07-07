package com.chris.league.ui.fragment.event.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chris.league.databinding.ItemListEventBinding
import com.chris.league.model.EventModel

class ListEventViewHolder(private val binding: ItemListEventBinding) :
    RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(
            parent: ViewGroup
        ): ListEventViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemListEventBinding.inflate(
                layoutInflater,
                parent,
                false
            )
            return ListEventViewHolder(binding)
        }
    }

    fun bind(item: EventModel) {
        binding.apply {
            this.eventModel = item
            executePendingBindings()
        }
    }

}