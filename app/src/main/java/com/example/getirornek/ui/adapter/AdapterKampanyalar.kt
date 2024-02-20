package com.example.getirornek.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirornek.data.KampanyalarData
import com.example.getirornek.databinding.CardKampanyalarBinding

class AdapterKampanyalar(var mContext:Context,var kampanylarList:List<KampanyalarData>)
    :RecyclerView.Adapter<AdapterKampanyalar.CardKampanyalarTutucu>(){


    inner class CardKampanyalarTutucu(var binding:CardKampanyalarBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardKampanyalarTutucu {
       val binding=CardKampanyalarBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardKampanyalarTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kampanylarList.size
    }

    override fun onBindViewHolder(holder: CardKampanyalarTutucu, position: Int) {
        val list=kampanylarList.get(position)
        val t =holder.binding
        t.textViewKampanya.text=list.aciklama
        t.imageViewKampanya.setImageResource(mContext.resources.getIdentifier(list.resimler,"drawable",mContext.packageName))
    }


}