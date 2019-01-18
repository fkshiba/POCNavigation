package com.felipeshiba.pocnavigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
//        val clickListener = Navigation.createNavigateOnClickListener(R.id.action_home_graph_to_restaurantActivity)
//        view.button.setOnClickListener(clickListener)
        return view
    }
}
