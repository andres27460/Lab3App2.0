package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentMonedero2Binding


class Monedero2 : Fragment() {

    private lateinit var Monedero2FragmentBinding: FragmentMonedero2Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        Monedero2FragmentBinding = FragmentMonedero2Binding.inflate(inflater,container,false)

        Monedero2FragmentBinding.button12.setOnClickListener(){
            findNavController().navigate(R.id.action_monedero2_to_pasajero_Fragment)
        }
        return Monedero2FragmentBinding.root
    }

}