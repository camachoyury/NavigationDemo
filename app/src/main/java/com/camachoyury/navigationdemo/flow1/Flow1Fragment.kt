package com.camachoyury.navigationdemo.flow1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.camachoyury.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_flow1.*


/**
 * A simple [Fragment] subclass.
 *
 */
class Flow1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_flow1, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button2.setOnClickListener{ findNavController().navigate(R.id.action_flow1Fragment_to_flow1Fragment2)}
    }
}
