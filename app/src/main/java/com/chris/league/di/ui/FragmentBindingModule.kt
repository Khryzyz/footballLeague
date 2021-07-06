package com.chris.league.di.ui

import com.chris.league.ui.fragment.description.DescriptionFragment
import com.chris.league.ui.fragment.detail.DetailFragment
import com.chris.league.ui.fragment.event.EventFragment
import com.chris.league.ui.fragment.home.HomeFragment
import com.chris.league.ui.fragment.institution.InstitutionFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    abstract fun contributesHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributesDetailFragment(): DetailFragment

    @ContributesAndroidInjector
    abstract fun contributesDescriptionFragment(): DescriptionFragment

    @ContributesAndroidInjector
    abstract fun contributesInstitutionFragment(): InstitutionFragment

    @ContributesAndroidInjector
    abstract fun contributesEventFragment(): EventFragment
}