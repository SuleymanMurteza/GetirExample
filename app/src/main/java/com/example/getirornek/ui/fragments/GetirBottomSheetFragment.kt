package com.example.getirornek.ui.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.getirornek.R
import com.example.getirornek.databinding.FragmentGetirBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar

class GetirBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentGetirBottomSheetBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding= FragmentGetirBottomSheetBinding.inflate(inflater,container,false)

        binding.share.setOnClickListener {
            Snackbar.make(it,"Paylaşılsın Mı",Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                    Snackbar.make(it,"Paylaşıldı",Snackbar.LENGTH_SHORT).show()
                }
                .setTextColor(Color.BLUE)
                .setBackgroundTint(Color.WHITE)
                .setActionTextColor(Color.BLUE)
                .show()
        }



        return binding.root
    }


}