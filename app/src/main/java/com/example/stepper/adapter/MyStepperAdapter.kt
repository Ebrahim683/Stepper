package com.example.stepper.adapter

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel

class MyStepperAdapter(fragmentManager: FragmentManager, context: Context) :
    AbstractFragmentStepAdapter(fragmentManager, context) {

    private val CURRENT_STEP_POSITION = "step_pos";

    override fun getCount(): Int {
        return 3
    }

    override fun createStep(position: Int): Step {
        val stepFragmentSample = StepFragmentSample()
        val bundle = Bundle()
        bundle.putInt(CURRENT_STEP_POSITION, position)
        stepFragmentSample.arguments = bundle
        return stepFragmentSample
    }

    override fun getViewModel(position: Int): StepViewModel {
        return StepViewModel.Builder(context)
            .setTitle("Step Title")
            .create()
    }
}