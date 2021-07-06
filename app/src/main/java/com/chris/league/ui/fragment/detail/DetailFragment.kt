package com.chris.league.ui.fragment.detail

import androidx.fragment.app.viewModels
import com.chris.league.databinding.FragmentDetailBinding
import com.chris.league.utils.base.BaseViewBindingFragment

class DetailFragment :
    BaseViewBindingFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {

    private val viewModel: DetailViewModel by viewModels { viewModelFactory }

}