package com.example.a21411047tugasempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SultanActivity : AppCompatActivity() {

    private lateinit var sultanRecyclerView: RecyclerView
    private lateinit var sultanMyAdapter: SultanMyAdapter
    private lateinit var listSultan :ArrayList<ItemSultanData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sultan)

        sultanRecyclerView = findViewById(R.id.SultanRV)
        listSultan = ArrayList()

        listSultan.add(ItemSultanData(R.drawable.osman1, "Osman I", "Berkuasa: 1299 - 1323", "Sultan Pertama Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.orhan1ke2, "Orhan I", "Berkuasa: 1323 - 1362", "Sultan Ke-2 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.murad1ke3, "Murad I", "Berkuasa: 1362 - 1389", "Sultan Ke-3 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.bayezid1ke4, "Bayezid I", "Berkuasa: 1389 - 1402", "Sultan Ke-4 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.mehmed1ke5, "Mehmed I", "Berkuasa: 1413 - 1421", "Sultan Ke-5 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.murad2ke6, "Murad II", "Berkuasa: 1421 - 1451", "Sultan Ke-6 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.mehmed2ke7, "Mehmed II", "Berkuasa: 1444 - 1481", "Sultan Ke-7 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.bayezid2ke8, "Bayezid II", "Berkuasa: 1481 - 1512", "Sultan Ke-8 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.selim1ke9, "Selim I", "Berkuasa: 1412 - 1520", "Sultan Ke-9 Utsmaniyah"))
        listSultan.add(ItemSultanData(R.drawable.suleiman1ke10, "Suleiman I", "Berkuasa: 1420 - 1566", "Sultan Ke-10 Utsmaniyah"))

        sultanRecyclerView.layoutManager = LinearLayoutManager(this)
        sultanRecyclerView.setHasFixedSize(true)
        sultanMyAdapter = SultanMyAdapter(listSultan)
        sultanRecyclerView.adapter = sultanMyAdapter
    }
}