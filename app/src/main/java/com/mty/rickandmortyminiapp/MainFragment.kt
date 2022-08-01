package com.mty.rickandmortyminiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

import com.mty.rickandmortyminiapp.databinding.FragmentMainBinding
import java.net.URL


class MainFragment : Fragment(), onClick {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: MainAdapter
    private lateinit var data: ArrayList<Character>
    private lateinit var navController: NavController

    companion object{
        const val MFN : String = "main_fragment_name"
        const val MFL : String = "main_fragment_life"
        const val MFP : String = "main_fragment_picture"
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
loadData()
        adapter = MainAdapter(data, this)
        binding.recyclerView.adapter = adapter

    }

    private fun loadData() {
        data = ArrayList()
        data.apply {
            add(Character("Rick Sanchez" ,"Alive",  "https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest?cb=20160923150728"))
            add(Character("Morty Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/1/17/Mechanical_Morty.png/revision/latest?cb=20170731155031"))
            add(Character("Albert Einstein" ,"Dead", "https://static.wikia.nocookie.net/rickandmorty/images/b/bc/Albert_Einstein.png/revision/latest?cb=20150730213810"))
            add(Character("Jerry Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/f/f1/Jerry_Smith.png/revision/latest?cb=20160923151111"))
            add(Character("Rick Sanchez" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest?cb=20160923150728"))
            add(Character("Morty Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/1/17/Mechanical_Morty.png/revision/latest?cb=20170731155031"))
            add(Character("Albert Einstein" ,"Dead","https://static.wikia.nocookie.net/rickandmorty/images/b/bc/Albert_Einstein.png/revision/latest?cb=20150730213810"))
            add(Character("Jerry Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/f/f1/Jerry_Smith.png/revision/latest?cb=20160923151111"))
            add(Character("Rick Sanchez" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest?cb=20160923150728"))
            add(Character("Morty Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/1/17/Mechanical_Morty.png/revision/latest?cb=20170731155031"))
            add(Character("Albert Einstein" ,"Dead", "https://static.wikia.nocookie.net/rickandmorty/images/b/bc/Albert_Einstein.png/revision/latest?cb=20150730213810"))
            add(Character("Jerry Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/f/f1/Jerry_Smith.png/revision/latest?cb=20160923151111"))



        }
    }


    override fun onClick(character: Character) {
        val bundle = Bundle()
        bundle.putString(MFN,  character.name)
        bundle.putString(MFL, character.life)
        bundle.putString(MFP, character.picture)
        var secondFragment = SecondFragment()
        secondFragment.arguments = bundle
      findNavController().navigate(R.id.secondFragment, bundle)

    }
}