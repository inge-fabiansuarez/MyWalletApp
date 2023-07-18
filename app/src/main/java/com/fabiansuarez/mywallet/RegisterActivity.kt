package com.fabiansuarez.mywallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.fabiansuarez.mywallet.databinding.ActivityLoginBinding
import com.fabiansuarez.mywallet.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño utilizando DataBindingUtil
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        // Configurar los datos en el objeto Binding
        binding.user = User("Fabian Suarez")

        binding.btnRegister.setOnClickListener {
            binding.btnRegister.text = binding.etNameRegister.text.toString()
        }
    }
}