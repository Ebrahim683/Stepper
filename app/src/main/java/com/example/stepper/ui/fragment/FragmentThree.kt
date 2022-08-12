package com.example.stepper.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.stepper.R
import kotlinx.android.synthetic.main.fragment_three.view.*

class FragmentThree : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three, container, false)

        view.btn_frag_three.setOnClickListener {
            Toast.makeText(requireContext(), "Fragment Three", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}