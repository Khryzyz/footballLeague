package com.chris.league.ui.fragment.institution

import android.os.Bundle
import android.view.View
import com.chris.league.databinding.FragmentInstitutionBinding
import com.chris.league.model.TeamModel
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment

class InstitutionFragment :
    BaseViewBindingFragment<FragmentInstitutionBinding>(FragmentInstitutionBinding::inflate) {

    companion object {
        fun newInstance(teamModel: TeamModel) = InstitutionFragment().apply {
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