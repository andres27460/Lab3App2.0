package com.example.jaxi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentRegisterFragmentBinding

import kotlinx.android.synthetic.main.fragment_register_fragment.*



class Register_fragment : Fragment() {

    private lateinit var Register_fragmentBinding: FragmentRegisterFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {
        Register_fragmentBinding = FragmentRegisterFragmentBinding.inflate(inflater,container,false)

        Register_fragmentBinding.button5.setOnClickListener(){
            if(editTextTextPassword.text.toString() == editTextTextPassword2.text.toString()){
                contra = editTextTextPassword.text.toString()
                usuario = editTextTextEmailAddress.text.toString()
                cedula = editTextNumber2.text.toString()
                findNavController().navigate(R.id.action_register_fragment_to_login_Fragment)
            }
            else{
                textView12.setText("Contraseñas no coinciden, ingrese los datos nuevamente")
            }
        }
        return Register_fragmentBinding.root
    }


}