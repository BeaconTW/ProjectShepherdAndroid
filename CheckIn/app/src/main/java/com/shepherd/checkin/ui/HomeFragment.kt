package com.shepherd.checkin.ui


import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.shepherd.checkin.R
import com.shepherd.checkin.databinding.FragmentHomeBinding
import com.shepherd.checkin.model.Event
import com.shepherd.checkin.ui.adapters.EventAdapter


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

            (activity as AppCompatActivity).setSupportActionBar(toolbarEventList)
            setHasOptionsMenu(true)
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main_app_bar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}
