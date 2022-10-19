package com.example.managerokr

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.list.RecyclerActivity
import com.example.managerokr.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonSignup = binding.buttonLoginSignup.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_login2_to_fragmen_sighup)
            //làm lại binding
        }
        val buttonLogin = binding.buttonLoginLogin.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_login2_to_secondActivity)

            val intent : Intent? = Intent(activity, RecyclerActivity::class.java)
            intent?.putExtra("data","hello")
            startActivity(intent)
        }
    }
}
