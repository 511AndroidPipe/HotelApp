package com.pipeanayap.hotelapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pipeanayap.hotelapp.domain.models.Room
import com.pipeanayap.hotelapp.services.RoomService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RoomViewModel @Inject constructor(
    private val roomService: RoomService
) : ViewModel(){

    //success
    private val  _roomEvent= MutableSharedFlow<List<Room>>()
    val roomEvent =_roomEvent.asSharedFlow()

    fun roomInfo() {
        viewModelScope.launch {
            try {
                val response = roomService.getRooms()
                Log.i("RoomViewModel", "Response: $response")
                if (response.any()) {
                    _roomEvent.emit(response)
                } else {
                    _roomEvent.emit(listOf())
                }
            } catch (e: Exception) {
                Log.e("RoomViewModel", "Error: ${e.message}", e)
                _roomEvent.emit(listOf())
            }
        }
    }

    fun roomByiD(){

    }



}
