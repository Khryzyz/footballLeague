package com.chris.league.di

import android.app.Application
import com.chris.league.app.LeagueApplication
import com.chris.league.di.core.ApplicationModule
import com.chris.league.di.source.MoshiModule
import com.chris.league.di.source.RetrofitModule
import com.chris.league.di.ui.FragmentBindingModule
import com.chris.league.di.viewModel.FragmentViewModelModule
import com.chris.league.di.viewModel.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        //General
        AndroidInjectionModule::class,
        ApplicationModule::class,
        //Layer.UI
        FragmentBindingModule::class,
        //Layer.ViewModel
        ViewModelFactoryModule::class,
        FragmentViewModelModule::class,
        //Source Remote
        RetrofitModule::class,
        MoshiModule::class,
    ]
)
interface ApplicationComponent : AndroidInjector<LeagueApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun create(application: Application): Builder

        fun build(): ApplicationComponent

    }

}