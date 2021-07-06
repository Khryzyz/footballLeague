package com.chris.league.ui.fragment.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.chris.league.databinding.FragmentDetailBinding
import com.chris.league.model.TeamModel
import com.chris.league.ui.activity.MainActivity
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment

class DetailFragment :
    BaseViewBindingFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {

    private val viewModel: DetailViewModel by viewModels { viewModelFactory }

    private lateinit var teamModel: TeamModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            teamModel =
                it.getSerializable(Constants.BundleKeys.TEAM_DETAIL) as TeamModel
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setTitle()
    }

    private fun setTitle() {
        (activity as MainActivity).supportActionBar?.let { actionBar ->
            with(actionBar) {
                title = teamModel.strTeam
            }
        }
    }
}