package com.chris.league.ui.fragment.home

import androidx.fragment.app.viewModels
import com.chris.league.databinding.FragmentHomeBinding
import com.chris.league.utils.base.BaseViewBindingFragment

class HomeFragment :
    BaseViewBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels { viewModelFactory }

}