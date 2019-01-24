package com.shepherd.checkin.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shepherd.checkin.databinding.FragmentHomeBinding
import com.shepherd.checkin.model.Event
import com.shepherd.checkin.ui.adapters.EventAdapter
import com.google.android.material.snackbar.Snackbar


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        val viewAdapter = EventAdapter(
            listOf(
                Event("Title1", "Desc1"),
                Event("Title2", "Desc2"),
                Event("Title3", "Desc3"),
                Event("Title4", "Desc4")
            )
        )


        binding.apply {
            fabNewEvent.setOnClickListener {
                Snackbar.make(root, "Hello World!", Snackbar.LENGTH_SHORT).show()
                Event("TitleX", "DescX")
            }

            rvEventList.adapter = viewAdapter
        }
        return binding.root
    }
}
