package com.example.stepper.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.stepper.R
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btn_frag_two.setOnClickListener {
            Toast.makeText(requireContext(), "Fragment Two", Toast.LENGTH_SHORT).show()
        }
        return view
    }

}