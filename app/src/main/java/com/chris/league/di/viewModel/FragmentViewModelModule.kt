package com.chris.league.di.viewModel

import androidx.lifecycle.ViewModel
import com.chris.league.ui.fragment.description.DescriptionViewModel
import com.chris.league.ui.fragment.detail.DetailViewModel
import com.chris.league.ui.fragment.event.EventViewModel
import com.chris.league.ui.fragment.home.HomeViewModel
import com.chris.league.ui.fragment.institution.InstitutionViewModel
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

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    internal abstract fun bindsDetailViewModel(viewModel: DetailViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(DescriptionViewModel::class)
//    internal abstract fun bindsDescriptionViewModel(viewModel: DescriptionViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(InstitutionViewModel::class)
//    internal abstract fun bindsInstitutionViewModel(viewModel: InstitutionViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(EventViewModel::class)
//    internal abstract fun bindsEventViewModel(viewModel: EventViewModel): ViewModel

}