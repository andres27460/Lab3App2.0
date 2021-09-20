package com.example.jaxi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentConductorFragmentBinding
import kotlinx.android.synthetic.main.fragment_conductor_fragment.*


class Conductor_fragment : Fragment() {

    private lateinit var Conductor_fragmentBinding: FragmentConductorFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Conductor_fragmentBinding = FragmentConductorFragmentBinding.inflate(inflater,container,false)
        Conductor_fragmentBinding.button6.setOnClickListener(){
            findNavController().navigate(R.id.action_conductor_fragment_to_map_Conductor_Fragment)
        }
        Conductor_fragmentBinding.button7.setOnClickListener(){
            findNavController().navigate(R.id.action_conductor_fragment_to_calificaciones_Fragment2)
        }
        Conductor_fragmentBinding.button9.setOnClickListener(){
            findNavController().navigate(R.id.action_conductor_fragment_to_monedero_Fragment)
        }
        Conductor_fragmentBinding.button8.setOnClickListener(){
            findNavController().navigate(R.id.action_conductor_fragment_to_login_Fragment)
        }

        Conductor_fragmentBinding.textView7.setText("Bienvenido: "+usuario)
        Conductor_fragmentBinding.textView20.setText("CC: "+cedula)
        return Conductor_fragmentBinding.root
    }

}