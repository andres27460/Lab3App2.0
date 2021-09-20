package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentPasajeroBinding



class Pasajero_Fragment : Fragment() {

    private lateinit var Pasajero_Binding: FragmentPasajeroBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        Pasajero_Binding = FragmentPasajeroBinding.inflate(inflater,container,false)

        Pasajero_Binding.button6.setOnClickListener(){
            findNavController().navigate(R.id.action_pasajero_Fragment_to_map_Pasajero_Fragment)
        }
        Pasajero_Binding.button7.setOnClickListener(){
            findNavController().navigate(R.id.action_pasajero_Fragment_to_monedero2)
        }
        Pasajero_Binding.button8.setOnClickListener(){
            findNavController().navigate(R.id.action_pasajero_Fragment_to_login_Fragment)
        }

        Pasajero_Binding.textView4.setText("Bienvenido: "+usuario)
        Pasajero_Binding.textView21.setText("CC: "+ cedula)
        return Pasajero_Binding.root
    }

}