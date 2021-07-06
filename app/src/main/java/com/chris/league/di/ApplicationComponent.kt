package com.chris.league.di

import android.app.Application
import com.chris.league.app.LeagueApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        //General
        AndroidInjectionModule::class
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