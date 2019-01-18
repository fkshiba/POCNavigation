package com.felipeshiba.pocnavigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_home2.view.*

class Home2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home2, container, false)

//        view.button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_home2Fragment_to_home3Fragment))
        view.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_home2Fragment_to_home3Fragment)

        }
        return view
    }
}
