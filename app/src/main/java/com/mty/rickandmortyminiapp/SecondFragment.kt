package com.mty.rickandmortyminiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mty.rickandmortyminiapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var bundle: Bundle
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvName = arguments?.getString(MainFragment.MFN)
        val tvLife = arguments?.getString(MainFragment.MFL)
        val tvPicture = arguments?.getString(MainFragment.MFP)
        binding.tvName.text = tvName
        binding.tvLife.text = tvLife
            tvPicture?.let { binding.ivPicture.loadWithGlide(it) }
    }
}