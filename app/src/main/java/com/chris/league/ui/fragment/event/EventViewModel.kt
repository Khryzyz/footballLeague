package com.chris.league.ui.fragment.event

import androidx.lifecycle.*
import com.chris.league.model.TeamModel
import com.chris.league.repository.event.EventRepository
import com.chris.league.utils.uiState.UIStateListEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class EventViewModel @Inject constructor(
    private val repository: EventRepository
) : ViewModel() {

    private val _listEvent = MutableLiveData<UIStateListEvent>()
    val listEvent: LiveData<UIStateListEvent>
        get() = _listEvent

    fun getListTeam(teamModel: TeamModel) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getListEvent(teamModel).collect {
                _listEvent.postValue(it)
            }
        }
    }
}