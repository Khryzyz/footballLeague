package com.chris.league.ui.fragment.event

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.chris.league.databinding.FragmentEventBinding
import com.chris.league.model.EventModel
import com.chris.league.model.TeamModel
import com.chris.league.ui.fragment.event.adapter.ListEventAdapter
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment
import com.chris.league.utils.uiState.UIStateListEvent

class EventFragment :
    BaseViewBindingFragment<FragmentEventBinding>(FragmentEventBinding::inflate) {

    companion object {
        fun newInstance(teamModel: TeamModel) = EventFragment().apply {
            arguments = Bundle().apply {
                putSerializable(Constants.BundleKeys.TEAM_DETAIL, teamModel)
            }
        }
    }

    //region Atributos
    private val viewModel: EventViewModel by viewModels { viewModelFactory }

    private lateinit var adapter: ListEventAdapter

    private lateinit var teamModel: TeamModel
    //endregion

    //region Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            teamModel =
                it.getSerializable(Constants.BundleKeys.TEAM_DETAIL) as TeamModel
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setObserver()
        setAdapter()
        viewModel.getListTeam(teamModel)
    }
    //endregion

    //region Set Components
    private fun setObserver() {
        viewModel.listEvent.observe(viewLifecycleOwner, { state ->
            when (state) {
                is UIStateListEvent.Loading -> handlerLoad()
                is UIStateListEvent.Success -> handlerSuccess(state.data)
                is UIStateListEvent.Error -> Unit
            }
        })
    }

    private fun setAdapter() {
        adapter = ListEventAdapter()
        binding.rcwListEvent.adapter = adapter
    }
    //endregion

    //region Metodos Privados
    private fun handlerLoad() {
        binding.vfListEvent.displayedChild =
            binding.vfListEvent.indexOfChild(binding.incLoadLayout.cnlLoadLayout)
    }

    private fun handlerSuccess(listEventModel: List<EventModel>) {
        adapter.submitList(listEventModel)
        binding.vfListEvent.displayedChild =
            binding.vfListEvent.indexOfChild(binding.rcwListEvent)
    }
    //endregion
}