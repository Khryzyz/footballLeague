package com.chris.league.ui.fragment.institution

import android.content.Intent
import android.net.Uri
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
        binding.apply {
            teamModel = this@InstitutionFragment.teamModel
            imvFacebook.setOnClickListener {
                navigateWeb(this@InstitutionFragment.teamModel.strFacebook)
            }
            imvTwitter.setOnClickListener {
                navigateWeb(this@InstitutionFragment.teamModel.strTwitter)
            }
            imvInstagram.setOnClickListener {
                navigateWeb(this@InstitutionFragment.teamModel.strInstagram)
            }
            imvWeb.setOnClickListener {
                navigateWeb(this@InstitutionFragment.teamModel.strWebsite)
            }
            executePendingBindings()
        }
    }

    private fun navigateWeb(url: String) {

        val httpUrl: String = if (url.contains("http://", true))
            url
        else
            "http://$url"

        val browse = Intent(Intent.ACTION_VIEW, Uri.parse(httpUrl))

        startActivity(browse)

    }
}