package com.example.managerokr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.managerokr.databinding.ActivityMainBinding
import com.example.managerokr.databinding.FragmentSighupBinding

class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSighupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSighupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonSignup = binding.buttonSignupSignin.setOnClickListener{
            findNavController().navigate(R.id.action_fragmen_sighup_to_secondActivity)
        }
        val buttonSignin = binding.buttonSignupSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_fragmen_sighup_to_fragment_login2)
        }
    }
}