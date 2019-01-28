package com.shepherd.checkin.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.shepherd.checkin.databinding.FragmentHomeBinding
import com.shepherd.checkin.model.EventViewModel
import com.shepherd.checkin.ui.adapters.EventAdapter


class HomeFragment : Fragment() {

    //    lateinit var firestoreListener: ListenerRegistration
    lateinit var adapter: FirestoreRecyclerAdapter<EventViewModel, EventViewHolder>
    private var events = mutableListOf<EventViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)


        binding.hasEvent = events.size != 0

        setupFirestore(binding.rvEventList)
        return binding.root
    }

    private fun setupFirestore(rv: RecyclerView) {
        val db = FirebaseFirestore.getInstance()
        val query = db.collection("events").orderBy("start", Query.Direction.ASCENDING)

        val options = FirestoreRecyclerOptions.Builder<EventViewModel>()
            .setQuery(query, EventViewModel::class.java)
            .build()

        adapter = EventAdapter(options)

        adapter.notifyDataSetChanged()
        rv.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        adapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }

    companion object {
        const val TAG = "Home"
    }
}
