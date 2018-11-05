package com.camachoyury.navigationdemo.flow0


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.camachoyury.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_item_list.*


/**
 * A simple [Fragment] subclass.
 *
 */
class ItemListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        button.setOnClickListener { findNavController().navigate(R.id.action_item_list_fragment_to_main2Activity) }
    }


}
