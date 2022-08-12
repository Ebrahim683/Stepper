package com.example.stepper.adapter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.stepper.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError

private const val TAG = "StepFragmentSample"

class StepFragmentSample : Fragment(), Step {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_main, container, false)
        return view
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {
        Log.d(TAG, "onSelected: Selected")
    }

    override fun onError(error: VerificationError) {
        Log.d(TAG, "onError: ${error.errorMessage}")
    }
}