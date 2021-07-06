package com.chris.league.di.viewModel

import androidx.lifecycle.ViewModel
import com.chris.league.ui.fragment.home.HomeViewModel
import com.chris.league.utils.viewModel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun bindsHomeViewModel(viewModel: HomeViewModel): ViewModel

}