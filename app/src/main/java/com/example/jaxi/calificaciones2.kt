package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentCalificaciones2Binding


class calificaciones2 : Fragment() {

    private lateinit var calificaciones2FragmentBinding: FragmentCalificaciones2Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        calificaciones2FragmentBinding = FragmentCalificaciones2Binding.inflate(inflater,container,false)

        calificaciones2FragmentBinding.button13.setOnClickListener(){
            findNavController().navigate(R.id.action_calificaciones2_to_pasajero_Fragment)
        }
        return inflater.inflate(R.layout.fragment_calificaciones2, container, false)
    }

}