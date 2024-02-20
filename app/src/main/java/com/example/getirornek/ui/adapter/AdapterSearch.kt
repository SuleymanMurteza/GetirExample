package com.example.getirornek.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirornek.data.SearchData
import com.example.getirornek.databinding.SearchCardTasarimBinding
import com.example.getirornek.ui.fragments.SearchFragment

class AdapterSearch(var mContext:Context,var search_name:List<SearchData>)
    :RecyclerView.Adapter<AdapterSearch.SearchCardTasarimHolder>(){


    inner class SearchCardTasarimHolder(var tasarim:SearchCardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchCardTasarimHolder {
        var binding=SearchCardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return SearchCardTasarimHolder(binding)
    }

    override fun getItemCount(): Int {
        return search_name.size
    }

    override fun onBindViewHolder(holder: SearchCardTasarimHolder, position: Int) {
        val searchName=search_name.get(position)
        val t=holder.tasarim
        t.textView3.text=searchName.name_search
    }
}