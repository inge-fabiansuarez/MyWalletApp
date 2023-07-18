package com.fabiansuarez.mywallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.fabiansuarez.mywallet.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)


    }

    fun clickSignIn(view: View) {
        if (binding.etEmail.text.isNotEmpty() && binding.etPass.text.isNotEmpty()) {
            return
        } else {
            Toast.makeText(this, "Debes digitar todos los campos", Toast.LENGTH_SHORT).show()
        }
    }

    fun clickRegister(view: View) {
        startActivity(Intent(this, RegisterActivity::class.java))
    }
}