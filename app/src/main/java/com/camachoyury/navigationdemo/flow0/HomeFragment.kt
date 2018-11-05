package com.camachoyury.navigationdemo.flow0

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.camachoyury.navigationdemo.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment(){




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        imageView.setOnClickListener {
            view.findNavController().navigate(R.id.action_home_fragment_to_detail_fragment)
        }
    }



}