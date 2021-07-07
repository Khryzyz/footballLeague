package com.chris.league.ui.fragment.home

import androidx.lifecycle.*
import com.chris.league.repository.home.HomeRepository
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

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getListTeam() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getListTeam(4335).collect {
                _listTeam.postValue(it)
            }
        }
    }
}