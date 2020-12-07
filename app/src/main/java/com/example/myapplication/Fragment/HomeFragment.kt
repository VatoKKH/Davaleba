package com.example.myapplication.Fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var NavController: NavController
    private lateinit var EditText: EditText
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        NavController = Navigation.findNavController(view)
        EditText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button)

        button.setOnClickListener{
            var amount = EditText.text.toString().toInt()

            val action = HomeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)

            NavController.navigate(action)

        }


    }
}