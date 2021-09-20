package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentSeleccionFragmentBinding


class Seleccion_fragment : Fragment() {

    private lateinit var Seleccion_fragmentBinding: FragmentSeleccionFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {
        Seleccion_fragmentBinding = FragmentSeleccionFragmentBinding.inflate(inflater,container, false)
        Seleccion_fragmentBinding.button3.setOnClickListener(){
            findNavController().navigate(R.id.action_seleccion_fragment_to_conductor_fragment)

        }
        Seleccion_fragmentBinding.button4.setOnClickListener(){
            findNavController().navigate(R.id.action_seleccion_fragment_to_pasajero_Fragment)

        }
        return Seleccion_fragmentBinding.root
    }


}