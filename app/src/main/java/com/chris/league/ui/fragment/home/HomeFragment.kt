package com.chris.league.ui.fragment.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.chris.league.R
import com.chris.league.databinding.FragmentHomeBinding
import com.chris.league.model.TeamModel
import com.chris.league.ui.fragment.home.adapter.ClickItemTeam
import com.chris.league.ui.fragment.home.adapter.ListTeamAdapter
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment
import com.chris.league.utils.uiState.UIStateData

class HomeFragment :
    BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    //region Atributos
    private val viewModel: HomeViewModel by viewModels { viewModelFactory }

    private lateinit var adapter: ListTeamAdapter
    //endregion

    //region Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObserver()
        setAdapter()
        lifecycle.addObserver(viewModel)
    }
    //endregion

    //region Set Components
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
        adapter = ListTeamAdapter(clickItemTeam)
        binding.rcwListTeam.adapter = adapter

    }
    //endregion

    //region Metodos Privados
    private fun handlerLoad() {
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.incLoadLayout.cnlLoadLayout)
    }

    private fun handlerSuccess(listTeamModel: List<TeamModel>) {
        adapter.submitList(listTeamModel)
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.rcwListTeam)
    }

    //endregion

    //region Listeners

    private var clickItemTeam = object : ClickItemTeam {
        override fun onClickNavigateDetail(teamModel: TeamModel) {
            findNavController().navigate(
                R.id.action_homeFragment_to_detailFragment,
                Bundle().apply {
                    putSerializable(
                        Constants.BundleKeys.TEAM_DETAIL,
                        teamModel
                    )
                }
            )
        }

    }
    //endregion

}