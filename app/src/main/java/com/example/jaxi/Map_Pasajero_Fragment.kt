package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentMapPasajeroBinding


class Map_Pasajero_Fragment : Fragment() {

    private lateinit var Map_Pasajero_FragmentBinding: FragmentMapPasajeroBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Map_Pasajero_FragmentBinding = FragmentMapPasajeroBinding.inflate(inflater,container,false)

        Map_Pasajero_FragmentBinding.button15.setOnClickListener(){
            findNavController().navigate(R.id.action_map_Pasajero_Fragment_to_pasajero_Fragment)
        }
        return Map_Pasajero_FragmentBinding.root

    }


}