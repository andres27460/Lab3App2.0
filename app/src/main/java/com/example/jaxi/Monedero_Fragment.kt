package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentMonederoBinding

class Monedero_Fragment : Fragment() {

    private lateinit var  Monedero_FragmentBinding: FragmentMonederoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?    ): View? {
        Monedero_FragmentBinding = FragmentMonederoBinding.inflate(inflater, container, false)
        Monedero_FragmentBinding.button11.setOnClickListener(){
            findNavController().navigate(R.id.action_monedero_Fragment_to_conductor_fragment)
        }
        return Monedero_FragmentBinding.root
    }


}