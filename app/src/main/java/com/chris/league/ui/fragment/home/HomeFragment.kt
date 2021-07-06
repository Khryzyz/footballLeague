package com.chris.league.ui.fragment.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.chris.league.databinding.FragmentHomeBinding
import com.chris.league.utils.base.BaseViewBindingFragment
import com.chris.league.utils.uiState.UIStateData

class HomeFragment :
    BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObserver()
        lifecycle.addObserver(viewModel)
    }

    private fun setObserver() {
        viewModel.data.observe(viewLifecycleOwner, { state ->
            when (state) {
                is UIStateData.Loading -> binding.data.text = "Cargando"
                is UIStateData.Success -> binding.data.text = state.data.toString()
                is UIStateData.Error -> binding.data.text = state.errorMessage
            }
        })
    }
}