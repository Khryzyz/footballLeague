package com.chris.league.app

import com.chris.league.di.DaggerApplicationComponent
import com.chris.league.utils.Constants
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class LeagueApplication : DaggerApplication() {

    companion object {
        var actualLeagueId: Int = Constants.ID_SPAIN_LEAGUE
        var actualPosition: Int = 0
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder()
            .create(this)
            .build()
    }

}