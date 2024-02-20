package com.example.getirornek.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirornek.data.KategorilerData
import com.example.getirornek.databinding.CardKategoriBinding

class AdapterKategoriler(var mContext: Context,var kategorilerList:List<KategorilerData>)
    :RecyclerView.Adapter<AdapterKategoriler.CardKategoriHolder>(){

    inner class CardKategoriHolder(var binding: CardKategoriBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardKategoriHolder {
       val binding=CardKategoriBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardKategoriHolder(binding)
    }

    override fun getItemCount(): Int {
        return kategorilerList.size
    }

    override fun onBindViewHolder(holder: CardKategoriHolder, position: Int) {
        val kategoriList=kategorilerList.get(position)
        val binding=holder.binding

        binding.imageViewKategroi.setImageResource(mContext.resources.getIdentifier(kategoriList.kategori_resim,"drawable",mContext.packageName))
        binding.textViewKategoriAd.text=kategoriList.kategori_ad
    }

}