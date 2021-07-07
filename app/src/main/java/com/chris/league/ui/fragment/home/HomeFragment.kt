package com.chris.league.ui.fragment.home

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.chris.league.R
import com.chris.league.app.LeagueApplication
import com.chris.league.databinding.FragmentHomeBinding
import com.chris.league.model.LeagueModel
import com.chris.league.model.TeamModel
import com.chris.league.ui.fragment.home.adapter.ClickItemTeam
import com.chris.league.ui.fragment.home.adapter.CustomDropDownAdapter
import com.chris.league.ui.fragment.home.adapter.ListTeamAdapter
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment
import com.chris.league.utils.uiState.UIStateListLeague
import com.chris.league.utils.uiState.UIStateListTeam


class HomeFragment :
    BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    //region Atributos
    private val viewModel: HomeViewModel by viewModels { viewModelFactory }

    private lateinit var adapter: ListTeamAdapter

    private lateinit var listLeague: List<LeagueModel>

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
        viewModel.listTeam.observe(viewLifecycleOwner, { state ->
            when (state) {
                is UIStateListTeam.Loading -> handlerLoad()
                is UIStateListTeam.Success -> handlerSuccessGetListTeam(state.data)
                is UIStateListTeam.Error -> handlerError(state.errorMessage)
            }
        })
        viewModel.listLeague.observe(viewLifecycleOwner, { state ->
            when (state) {
                is UIStateListLeague.Loading -> Unit
                is UIStateListLeague.Success -> handlerSuccessGetListLeague(state.data)
                is UIStateListLeague.Error -> handlerErrorGetListLeague(state.errorMessage)
            }
        })
    }

    private fun handlerErrorGetListLeague(errorMessage: String) {
        Toast.makeText(
            context,
            getString(R.string.text_error_league, errorMessage),
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun handlerSuccessGetListLeague(listLeague: List<LeagueModel>) {
        this@HomeFragment.listLeague = listLeague
        setupSpinnerAdapter()
    }

    private fun setAdapter() {
        adapter = ListTeamAdapter(clickItemTeam)
        binding.rcwListTeam.adapter = adapter
    }

    private fun setupSpinnerAdapter() {
        val customDropDownAdapter = context?.let { CustomDropDownAdapter(it, listLeague) }
        binding.spnListLeague.apply {
            adapter = customDropDownAdapter
            onItemSelectedListener = selectedItemLeague
            setSelection(LeagueApplication.actualPosition)
        }
    }
    //endregion

    //region Metodos Privados
    private fun handlerLoad() {
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.incLoadLayout.cnlLoadLayout)
    }

    private fun handlerSuccessGetListTeam(listTeamModel: List<TeamModel>) {
        adapter.submitList(listTeamModel)
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.rcwListTeam)
    }

    private fun handlerError(errorMessage: String) {
        binding.vfListTeam.displayedChild =
            binding.vfListTeam.indexOfChild(binding.incErrorLayout.cnlErrorLayout)
        binding.incErrorLayout.txvErrorMessage.text = errorMessage
    }
//endregion

//region Listeners

    private var selectedItemLeague = object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val leagueId = listLeague[position].idLeague
            LeagueApplication.actualLeagueId = leagueId
            LeagueApplication.actualPosition = position
            viewModel.getListTeam(leagueId)
        }

        override fun onNothingSelected(parent: AdapterView<*>?) = Unit
    }

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