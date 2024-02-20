package com.example.getirornek.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirornek.R
import com.example.getirornek.data.SearchData
import com.example.getirornek.databinding.FragmentSearchBinding
import com.example.getirornek.ui.adapter.AdapterSearch

class SearchFragment : Fragment() {
    private lateinit var binding:FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentSearchBinding.inflate(inflater,container,false)

        binding.rvSearch.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val names=ArrayList<SearchData>()
        val n1=SearchData("su")
        val n2=SearchData("cips")
        val n3=SearchData("süt")
        val n4=SearchData("soda")
        val n5=SearchData("çikolata")
        val n6=SearchData("ekmek")
        val n7=SearchData("yoğurt")
        val n8=SearchData("kola")
        val n9=SearchData("çekirdek")
        names.add(n1)
        names.add(n2)
        names.add(n3)
        names.add(n4)
        names.add(n5)
        names.add(n6)
        names.add(n7)
        names.add(n8)
        names.add(n9)

        val searchAdapter=AdapterSearch(requireContext(),names)
        binding.rvSearch.adapter=searchAdapter





        return binding.root
    }


}