package com.shepherd.checkin.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.shepherd.checkin.R
import com.shepherd.checkin.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentFavoriteBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_favorite, container, false)

        return binding.root
    }


}
