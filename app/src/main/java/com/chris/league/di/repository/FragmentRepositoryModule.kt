package com.chris.league.di.repository

import com.chris.league.repository.home.HomeRepository
import com.chris.league.repository.home.HomeRepositoryImp
import dagger.Binds
import dagger.Module

@Module
abstract class FragmentRepositoryModule {

    @Binds
    abstract fun bindsHomeRepository(repository: HomeRepositoryImp): HomeRepository

}