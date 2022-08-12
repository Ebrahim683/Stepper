package com.example.stepper.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.stepper.R
import com.example.stepper.adapter.MyStepperAdapter
import com.example.stepper.ui.fragment.FragmentOne
import com.example.stepper.ui.fragment.FragmentThree
import com.example.stepper.ui.fragment.FragmentTwo
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), StepperLayout.StepperListener {
    private lateinit var stepperLayout: StepperLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stepperLayout = findViewById(R.id.stepperLayout)
        stepperLayout.adapter = MyStepperAdapter(supportFragmentManager, this)
        stepperLayout.setListener(this)
        switchFragment(FragmentOne())
    }

    override fun onCompleted(completeButton: View?) {
        Log.d(TAG, "onCompleted: completed")
        startActivity(Intent(this, HomeActivity::class.java))
    }

    override fun onError(verificationError: VerificationError?) {

    }

    override fun onStepSelected(newStepPosition: Int) {
        when (newStepPosition) {
            0 -> {
                Log.d(TAG, "onStepSelected: 0")
                switchFragment(FragmentOne())
            }
            1 -> {
                Log.d(TAG, "onStepSelected: 1")
                switchFragment(FragmentTwo())
            }
            2 -> {
                Log.d(TAG, "onStepSelected: 2")
                switchFragment(FragmentThree())
            }
        }
    }

    override fun onReturn() {

    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.id_container, fragment)
            .commit()
    }

}