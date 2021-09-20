package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentCalificacionesBinding

class Calificaciones_Fragment : Fragment() {

    private lateinit var Calificaciones_FragmentBinding: FragmentCalificacionesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        Calificaciones_FragmentBinding = FragmentCalificacionesBinding.inflate(inflater,container,false)
        Calificaciones_FragmentBinding.button10.setOnClickListener(){
            findNavController().navigate(R.id.action_calificaciones_Fragment2_to_conductor_fragment)

        }
        return Calificaciones_FragmentBinding.root
    }


}