package com.chris.league.ui.fragment.event.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.chris.league.model.EventModel

class ListEventAdapter :
    ListAdapter<EventModel, ListEventViewHolder>(EventModel.DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListEventViewHolder {
        return ListEventViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ListEventViewHolder, position: Int) {
        val event = getItem(position)
        holder.bind(event)
    }

}