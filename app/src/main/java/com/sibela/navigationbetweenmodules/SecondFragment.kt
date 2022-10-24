package com.sibela.navigationbetweenmodules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sibela.navigationbetweenmodules.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
    }

    private fun setupListeners() = binding.run {
        buttonPrevious.setOnClickListener { onPreviousButtonClicked() }
        goToFirstModule.setOnClickListener { onGoToFirstModuleClicked() }
        goToSecondModule.setOnClickListener { onGoToSecondModuleClicked() }
    }

    private fun onPreviousButtonClicked() {
        findNavController().popBackStack()
    }

    private fun onGoToFirstModuleClicked() {
        findNavController().navigate(R.id.action_MainModuleFirstFragment_to_FirstModuleFirstFragment)
    }

    private fun onGoToSecondModuleClicked() {
        findNavController().navigate(R.id.action_MainModuleFirstFragment_to_SecondModuleFirstFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}