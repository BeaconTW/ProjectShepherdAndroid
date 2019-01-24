package com.shepherd.checkin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shepherd.checkin.databinding.ListItemEventBinding
import com.shepherd.checkin.model.Event

class EventAdapter(private val items: List<Event>) : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemEventBinding.inflate(inflater, parent, false)
        return EventViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size

    inner class EventViewHolder(val binding: ListItemEventBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Event) {
            binding.event = item
            binding.executePendingBindings()
        }

    }
}