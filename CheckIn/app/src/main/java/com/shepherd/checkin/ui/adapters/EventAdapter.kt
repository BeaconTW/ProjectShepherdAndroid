package com.shepherd.checkin.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestoreException
import com.shepherd.checkin.databinding.ListItemEventBinding
import com.shepherd.checkin.model.EventViewModel
import com.shepherd.checkin.ui.EventViewHolder

class EventAdapter(options: FirestoreRecyclerOptions<EventViewModel>) :
    FirestoreRecyclerAdapter<EventViewModel, EventViewHolder>(options) {
//    private val TYPE_HEADER = 0
//    private val TYPE_ITEM = 1

    override fun onBindViewHolder(holder: EventViewHolder, position: Int, model: EventViewModel) {
        holder.bind(model)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemEventBinding.inflate(inflater, parent, false)
        return EventViewHolder(binding)
    }


    override fun onError(e: FirebaseFirestoreException) {
        Log.e("error", e.message)
    }
}