package com.chris.league.di.source

import com.chris.league.source.datasource.LeagueDataSource
import com.chris.league.source.datasource.LeagueDataSourceImp
import dagger.Binds
import dagger.Module

@Module
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun provideLeagueDataSource(remoteDataSource: LeagueDataSourceImp): LeagueDataSource

}
