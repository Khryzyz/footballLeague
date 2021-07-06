package com.chris.league.ui.fragment.event

import android.os.Bundle
import android.view.View
import com.chris.league.databinding.FragmentEventBinding
import com.chris.league.model.TeamModel
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment

class EventFragment :
    BaseViewBindingFragment<FragmentEventBinding>(FragmentEventBinding::inflate) {

    companion object {
        fun newInstance(teamModel: TeamModel) = EventFragment().apply {
            arguments = Bundle().apply {
                putSerializable(Constants.BundleKeys.TEAM_DETAIL, teamModel)
            }
        }
    }

    private lateinit var teamModel: TeamModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            teamModel =
                it.getSerializable(Constants.BundleKeys.TEAM_DETAIL) as TeamModel
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}