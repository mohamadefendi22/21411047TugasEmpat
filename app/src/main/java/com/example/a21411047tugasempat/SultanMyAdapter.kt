package com.example.a21411047tugasempat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class SultanMyAdapter (private val namaList : ArrayList<ItemSultanData>) :RecyclerView.Adapter<SultanMyAdapter.MyViewHolder>() {

    class MyViewHolder (itemData: View) : RecyclerView.ViewHolder (itemData){
        val gambar : ImageView = itemData.findViewById(R.id.img)
        val nama : TextView = itemData.findViewById(R.id.txtsultan)
        val tahun : TextView =itemData.findViewById(R.id.menjabat)
        val kesultanan : TextView =itemData.findViewById(R.id.wangsa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.item_sultan_data, parent, false)
        return  MyViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem =namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.tahun.text = currentItem.tahun
        holder.kesultanan.text = currentItem.kesultanan
    }
}