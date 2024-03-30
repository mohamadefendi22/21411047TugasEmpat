package com.example.a21411047tugasempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21411047tugasempat.databinding.ActivityDaftarBinding
import com.example.a21411047tugasempat.databinding.ActivityLupaSandiBinding

class LupaSandiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLupaSandiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_sandi)

        binding = ActivityLupaSandiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icKembaliLS.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }

        binding.txtKembaliLS.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }

    }
}