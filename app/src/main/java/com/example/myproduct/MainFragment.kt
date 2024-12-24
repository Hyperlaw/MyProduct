package com.example.myproduct

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myproduct.databinding.ActivityMainBinding
import com.example.myproduct.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.constantLayout.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container, RVFragment()).addToBackStack(null).commit()
        }

        binding.constantLayout2.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container, RVDrinksFragment()).addToBackStack(null).commit()
        }
    }


}