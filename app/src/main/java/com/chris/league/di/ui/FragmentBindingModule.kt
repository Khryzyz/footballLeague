package com.chris.league.di.ui

import com.chris.league.ui.fragment.detail.DetailFragment
import com.chris.league.ui.fragment.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    abstract fun contributesHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributesDetailFragment(): DetailFragment
}