package com.chris.league.ui.fragment.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.chris.league.databinding.FragmentHomeBinding
import com.chris.league.model.TeamModel
import com.chris.league.ui.fragment.home.adapter.ListTeamAdapter
import com.chris.league.utils.base.BaseViewBindingFragment
import com.chris.league.utils.uiState.UIStateData

class HomeFragment :
    BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels { viewModelFactory }

    private lateinit var adapter: ListTeamAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObserver()
        setAdapter()
        lifecycle.addObserver(viewModel)
    }

    private fun setObserver() {
        viewModel.data.observe(viewLifecycleOwner, { state ->
            when (state) {
                is UIStateData.Loading -> handlerLoad()
                is UIStateData.Success -> handlerSuccess(state.data)
                is UIStateData.Error -> Unit
            }
        })
    }

    private fun setAdapter() {
        adapter = ListTeamAdapter()
        binding.rcwListTeam.adapter = adapter

    }

    private fun handlerLoad() {
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.incLoadLayout.cnlLoadLayout)
    }

    private fun handlerSuccess(listPokemonModel: List<TeamModel>) {
        adapter.submitList(listPokemonModel)
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.rcwListTeam)
    }
}