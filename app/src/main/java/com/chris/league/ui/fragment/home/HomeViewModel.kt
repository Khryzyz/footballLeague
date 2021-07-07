package com.chris.league.ui.fragment.home

import androidx.lifecycle.*
import com.chris.league.repository.home.HomeRepository
import com.chris.league.utils.Constants
import com.chris.league.utils.uiState.UIStateListLeague
import com.chris.league.utils.uiState.UIStateListTeam
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel
@Inject constructor(
    private val repository: HomeRepository
) : ViewModel(), LifecycleObserver {

    private val _listTeam = MutableLiveData<UIStateListTeam>()
    val listTeam: LiveData<UIStateListTeam>
        get() = _listTeam

    private val _listLeague = MutableLiveData<UIStateListLeague>()
    val listLeague: LiveData<UIStateListLeague>
        get() = _listLeague

    fun getListTeam(leagueId: Int = Constants.ID_SPAIN_LEAGUE) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getListTeam(leagueId).collect {
                _listTeam.postValue(it)
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getListLeague() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getListLeague().collect {
                _listLeague.postValue(it)
            }
        }
    }

}