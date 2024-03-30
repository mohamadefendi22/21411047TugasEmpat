package com.example.a21411047tugasempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21411047tugasempat.databinding.ActivityDaftarBinding

class DaftarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaftarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1D.setOnClickListener {
            val intentRumah = Intent(this, RumahActivity::class.java)
            startActivity(intentRumah)
        }

        binding.txtMas.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }
    }
}