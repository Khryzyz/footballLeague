package com.chris.league.ui.fragment.description

import android.os.Bundle
import android.view.View
import com.chris.league.databinding.FragmentDescriptionBinding
import com.chris.league.model.TeamModel
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment

class DescriptionFragment :
    BaseViewBindingFragment<FragmentDescriptionBinding>(FragmentDescriptionBinding::inflate) {

    companion object {
        fun newInstance(teamModel: TeamModel) = DescriptionFragment().apply {
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