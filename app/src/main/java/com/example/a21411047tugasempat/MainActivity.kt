package com.example.a21411047tugasempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21411047tugasempat.databinding.ActivityDaftarBinding
import com.example.a21411047tugasempat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txt2M.setOnClickListener {
            val intentLupaSandi = Intent(this, LupaSandiActivity::class.java)
            startActivity(intentLupaSandi)
        }

        binding.btn1M.setOnClickListener {
            val intentRumah = Intent(this, RumahActivity::class.java)
            startActivity(intentRumah)
        }

        binding.txtDaf.setOnClickListener {
            val intentDaftar = Intent(this, DaftarActivity::class.java)
            startActivity(intentDaftar)
        }
    }
}