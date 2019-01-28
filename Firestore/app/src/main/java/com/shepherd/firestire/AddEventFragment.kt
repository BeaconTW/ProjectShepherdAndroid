package com.shepherd.firestire


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shepherd.firestire.databinding.FragmentAddEventBinding


class AddEventFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentAddEventBinding.inflate(inflater, container, false)
        return binding.root
    }
}
