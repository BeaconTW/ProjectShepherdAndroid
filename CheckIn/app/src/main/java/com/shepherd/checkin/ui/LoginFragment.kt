package com.shepherd.checkin.ui


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.shepherd.checkin.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.apply {
            nextButton.setOnClickListener {
                val email = editTextEmail.text.toString()
                val password = editTextPassword.text.toString()

                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(context, "Successful", Toast.LENGTH_SHORT)
                                .show()
                        }
                        else{
                            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
            }

            cancelButton.setOnClickListener {
                val intent = Intent(context, MainActivity::class.java)
                startActivity(intent)
            }
        }

        return binding.root
    }
}
