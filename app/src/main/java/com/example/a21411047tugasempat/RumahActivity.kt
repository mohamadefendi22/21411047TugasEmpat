package com.example.a21411047tugasempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21411047tugasempat.databinding.ActivityMainBinding
import com.example.a21411047tugasempat.databinding.ActivityRumahBinding

class RumahActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRumahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumah)

        binding = ActivityRumahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sultanR.setOnClickListener {
            val intentSultan = Intent(this, SultanActivity::class.java)
            startActivity(intentSultan)
        }

        binding.daftarR.setOnClickListener {
            val intentSultan = Intent(this, SultanActivity::class.java)
            startActivity(intentSultan)
        }

        binding.pesanR.setOnClickListener {
            val intentKirimPesan = Intent(this, KirimPesanActivity::class.java)
            startActivity(intentKirimPesan)
        }

        binding.kirimR.setOnClickListener {
            val intentKirimPesan = Intent(this, KirimPesanActivity::class.java)
            startActivity(intentKirimPesan)
        }
    }
}