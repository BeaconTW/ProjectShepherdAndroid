package com.shepherd.checkin.ui

import androidx.recyclerview.widget.RecyclerView
import com.shepherd.checkin.databinding.ListItemEventBinding
import com.shepherd.checkin.model.EventViewModel

class EventViewHolder(val binding: ListItemEventBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: EventViewModel) {
        binding.event = item
        binding.executePendingBindings()
    }
}