package com.example.sandbox


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_blank_fragment2.*

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        graphIdContainer.text = findNavController().graph.id.toString()


        to4.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment4)
        }

        exitFlow.setOnClickListener {
            findNavController().navigate(R.id.exitNavigation2)
        }


    }
}
