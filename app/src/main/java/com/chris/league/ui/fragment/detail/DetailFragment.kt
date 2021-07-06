package com.chris.league.ui.fragment.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.chris.league.R
import com.chris.league.databinding.FragmentDetailBinding
import com.chris.league.model.TeamModel
import com.chris.league.ui.activity.MainActivity
import com.chris.league.ui.fragment.description.DescriptionFragment
import com.chris.league.ui.fragment.event.EventFragment
import com.chris.league.ui.fragment.institution.InstitutionFragment
import com.chris.league.utils.Constants
import com.chris.league.utils.base.BaseViewBindingFragment
import com.chris.league.utils.base.BaseViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class DetailFragment :
    BaseViewBindingFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {

    private val viewModel: DetailViewModel by viewModels { viewModelFactory }

    private lateinit var teamModel: TeamModel

    private lateinit var viewPagerAdapter: BaseViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            teamModel =
                it.getSerializable(Constants.BundleKeys.TEAM_DETAIL) as TeamModel
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setTitle()
        setViewPagerAdapter()
        binding.incDetailTeam.incDetailHeaderTeam.apply {
            this.teamModel = this@DetailFragment.teamModel
            executePendingBindings()
        }

    }

    private fun setTitle() {
        (activity as MainActivity).supportActionBar?.let { actionBar ->
            with(actionBar) {
                title = teamModel.strTeam
            }
        }
    }


    private fun setViewPagerAdapter() {

        viewPagerAdapter = BaseViewPagerAdapter(requireActivity())

        val fragments = mutableListOf<Fragment>()

        fragments.add(DescriptionFragment.newInstance(teamModel))
        fragments.add(InstitutionFragment.newInstance(teamModel))
        fragments.add(EventFragment.newInstance(teamModel))

        viewPagerAdapter.addFragments(fragments)

        binding.incDetailTeam.viewPager.adapter = viewPagerAdapter

        TabLayoutMediator(
            binding.incDetailTeam.tabLayout,
            binding.incDetailTeam.viewPager
        ) { tab, position ->
            tab.text
            when (position) {
                0 -> tab.text = resources.getString(R.string.tab_description)
                1 -> tab.text = resources.getString(R.string.tab_institution)
                2 -> tab.text = resources.getString(R.string.tab_event)
            }
        }.attach()

    }

}