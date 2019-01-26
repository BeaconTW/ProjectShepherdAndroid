package com.shepherd.checkin.ui


import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.snackbar.Snackbar
import com.shepherd.checkin.R
import com.shepherd.checkin.databinding.FragmentHomeBinding
import com.shepherd.checkin.model.Event
import com.shepherd.checkin.ui.adapters.EventAdapter


class HomeFragment : Fragment() {

    lateinit var events: MutableList<Event>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)



        binding.apply {
            fabNewEvent.setOnClickListener {
                Snackbar.make(root, "Hello World!", Snackbar.LENGTH_SHORT).show()
                Event("TitleX", "DescX")
            }

            events = mutableListOf(
                Event("Title1", "Desc1"),
                Event("Title2", "Desc2"),
                Event("Title3", "Desc3"),
                Event("Title4", "Desc4")
            )

            hasEvent = events.size != 0

            rvEventList.adapter = EventAdapter(events)

            // Setup appbar
            (activity as AppCompatActivity).setSupportActionBar(toolbarEventList)
            setHasOptionsMenu(true)
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu_app_bar_home, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
