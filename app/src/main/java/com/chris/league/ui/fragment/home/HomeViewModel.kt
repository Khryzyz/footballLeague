package com.chris.league.ui.fragment.home

import androidx.lifecycle.*
import com.chris.league.repository.home.HomeRepository
import com.chris.league.utils.uiState.UIStateData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel
@Inject constructor(
    private val repository: HomeRepository
) : ViewModel(), LifecycleObserver {

    private val _data = MutableLiveData<UIStateData>()
    val data: LiveData<UIStateData>
        get() = _data

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getData(4335).collect {
                _data.postValue(it)
            }
        }
    }
}