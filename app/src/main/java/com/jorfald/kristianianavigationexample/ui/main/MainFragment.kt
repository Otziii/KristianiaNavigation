package com.jorfald.kristianianavigationexample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.jorfald.kristianianavigationexample.R

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    private lateinit var navigationButton: Button
    private lateinit var navigationButton2: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)

        navigationButton = view.findViewById(R.id.navigation_button)
        navigationButton2 = view.findViewById(R.id.navigation_button_2)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigationButton.setOnClickListener {
            findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToSecondFragment(
                            "Jonas",
                            50
                    )
            )
        }

        navigationButton2.setOnClickListener {

        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}