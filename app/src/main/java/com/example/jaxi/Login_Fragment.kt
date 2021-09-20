package com.example.jaxi

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login_.*

var usuario = "@@@@@@@"
var contra = "@@@@@@@"
var cedula = "@@@@@@@"

class Login_Fragment : Fragment() {

    // TODO: Rename and change types of parameters
    private lateinit var Login_FragmentBinding: FragmentLoginBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        Login_FragmentBinding = FragmentLoginBinding.inflate(inflater,container,false)



        Login_FragmentBinding.button.setOnClickListener(){
            if(editTextTextPersonName.text.toString() == usuario && editTextTextPersonName1.text.toString() == contra){
                Handler().postDelayed({
                    findNavController().navigate(R.id.action_login_Fragment_to_seleccion_fragment)
                },1)
            }
            else{
                textView13.setText("Datos incorrectos, intentelo de nuevo o registrese")
            }
        }

        return Login_FragmentBinding.root

    }





}