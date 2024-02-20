package com.example.getirornek.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirornek.R
import com.example.getirornek.data.GorsellerData
import com.example.getirornek.data.KategorilerData
import com.example.getirornek.databinding.FragmentGetirBinding
import com.example.getirornek.ui.adapter.AdapterGorseller
import com.example.getirornek.ui.adapter.AdapterKategoriler

class GetirFragment : Fragment() {
    private lateinit var binding: FragmentGetirBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentGetirBinding.inflate(inflater,container,false)
        binding.recyclerGorseller.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val resimler=ArrayList<GorsellerData>()
        val resim1=GorsellerData("getir_first")
        val resim2=GorsellerData("getir_second")
        val resim3=GorsellerData("getir_third")
        resimler.add(resim1)
        resimler.add(resim2)
        resimler.add(resim3)

        val resimlerAdapter=AdapterGorseller(requireContext(),resimler)
        binding.recyclerGorseller.adapter=resimlerAdapter

        binding.recyclerKategoriler.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val kategoriler=ArrayList<KategorilerData>()
        val k1=KategorilerData("Koşu Zamanı","kategori_kosu")
        val k2=KategorilerData("İndirimler","getir_indirimler")
        val k3=KategorilerData("Su & İçecek","kategori_icecek")
        val k4=KategorilerData("Meyve & Sebze","kategori_sebze")
        val k5=KategorilerData("Fırından","kategori_firindan")
        val k6=KategorilerData("Temel Gıda","kategori_temelgida")
        val k7=KategorilerData("Atıştırmalık","kategori_atistirmalik")
        val k8=KategorilerData("Dondurma","kategori_dondurma")
        val k9=KategorilerData("Süt Ürünleri","kategori_sut")
        val k10=KategorilerData("Kahvaltılık","kategori_kahvaltilik")
        val k11=KategorilerData("Yiyecek","kategori_yiyecek")
        val k12=KategorilerData("Fit & Form","kategori_fit")
        val k13=KategorilerData("Kişisel Bakım","kategori_kisiselbakim")
        val k14=KategorilerData("Ev Bakım","kategori_evbakim")
        val k15=KategorilerData("Ev & Yaşam","kategori_yasam")
        val k16=KategorilerData("Teknoloji","kategori_teknoloji")
        val k17=KategorilerData("Evcil Hayvan","kategori_evcil")
        val k18=KategorilerData("Bebek","kategori_bebek")
        val k19=KategorilerData("Cinsel Sağlık","kategori_cinsel")
        kategoriler.add(k1)
        kategoriler.add(k2)
        kategoriler.add(k4)
        kategoriler.add(k5)
        kategoriler.add(k6)
        kategoriler.add(k7)
        kategoriler.add(k8)
        kategoriler.add(k9)
        kategoriler.add(k10)
        kategoriler.add(k11)
        kategoriler.add(k12)
        kategoriler.add(k13)
        kategoriler.add(k14)
        kategoriler.add(k15)
        kategoriler.add(k16)
        kategoriler.add(k17)
        kategoriler.add(k18)
        kategoriler.add(k19)

        val kategorilerAdapter=AdapterKategoriler(requireContext(),kategoriler)
        binding.recyclerKategoriler.adapter=kategorilerAdapter

        binding.imageView2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisBottomShett)
        }






        return binding.root
    }

}