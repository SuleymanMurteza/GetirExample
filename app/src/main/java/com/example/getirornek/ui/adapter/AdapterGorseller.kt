package com.example.getirornek.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirornek.data.GorsellerData
import com.example.getirornek.databinding.CardGorsellerBinding

class AdapterGorseller(var mContext: Context,var resimler:List<GorsellerData>)
    :RecyclerView.Adapter<AdapterGorseller.CardGorsellerHolder>() {

    inner class CardGorsellerHolder(var tasarim: CardGorsellerBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardGorsellerHolder {
        val binding=CardGorsellerBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardGorsellerHolder(binding)
    }

    override fun getItemCount(): Int {
        return resimler.size
    }

    override fun onBindViewHolder(holder: CardGorsellerHolder, position: Int) {
        val resim=resimler.get(position)
        val binding=holder.tasarim
        binding.imageView4.setImageResource(mContext.resources.getIdentifier(resim.resim,"drawable",mContext.packageName))
    }
}