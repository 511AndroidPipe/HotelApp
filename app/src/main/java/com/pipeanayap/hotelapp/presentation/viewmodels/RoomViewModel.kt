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

    private val _roomIdEvent = MutableSharedFlow<List<Room>>()
    val roomIdEvent = _roomIdEvent.asSharedFlow() // Correcto

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

    fun roomByiD(id: String) {
        viewModelScope.launch {
            try {
                val response = roomService.getRoomsById(id)
                Log.i("RoomViewModel", "Room by ID Response: $response")
                _roomIdEvent.emit(listOf(response)) // Emitimos la habitación como una lista
                Log.i("RoomViewModel", "Emitiendo datos: $response")
            } catch (e: Exception) {
                Log.e("RoomViewModel", "Error fetching room by ID: ${e.message}", e)
                _roomIdEvent.emit(listOf()) // Emitimos una lista vacía en caso de error
            }
        }
    }



}
