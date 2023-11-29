package com.example.unittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unittest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            validateAndShowResult()
        }
    }

    private fun validateAndShowResult() {
        val username = binding.name.text.toString()
        val userpass = binding.pass.text.toString()
        val useremail = binding.email.text.toString()
        val userage = binding.age.text.toString().toIntOrNull() ?: 0

        val validationMessage = LoginUtils.validate(username, useremail, userpass, userage)

        if (validationMessage == null) {
            binding.resultTextView.text = "Validation successful"
        } else {
            binding.resultTextView.text = validationMessage
        }
    }

}