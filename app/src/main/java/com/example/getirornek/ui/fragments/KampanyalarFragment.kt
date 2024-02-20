package com.example.getirornek.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getirornek.R
import com.example.getirornek.data.KampanyalarData
import com.example.getirornek.databinding.FragmentKampanyalarBinding
import com.example.getirornek.ui.adapter.AdapterKampanyalar

class KampanyalarFragment : Fragment() {
    private lateinit var binding:FragmentKampanyalarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentKampanyalarBinding.inflate(inflater,container,false)

        binding.rv.layoutManager=LinearLayoutManager(requireContext())

        val kampanylarList=ArrayList<KampanyalarData>()
        val k1=KampanyalarData("getir_firstt","  Her 100 TL'ye 1 çekiliş hakkı!")
        val k2=KampanyalarData("getir_second","  Bugünün Görevi: Temel Gıda veya Yiyecek \n  siparişi ver!")
        val k3=KampanyalarData("getir_third","  Bir sonraki siparişinize size özel %50 indirim!")
        kampanylarList.add(k1)
        kampanylarList.add(k2)
        kampanylarList.add(k3)


        val kampanyalarAdapter=AdapterKampanyalar(requireContext(),kampanylarList)
        binding.rv.adapter=kampanyalarAdapter






        return binding.root
    }



}