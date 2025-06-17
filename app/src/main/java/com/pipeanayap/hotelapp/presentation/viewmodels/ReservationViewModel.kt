package com.pipeanayap.hotelapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pipeanayap.hotelapp.domain.models.Reservations
import com.pipeanayap.hotelapp.domain.models.Room
import com.pipeanayap.hotelapp.services.ReservationService
import com.pipeanayap.hotelapp.services.RoomService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ReservationViewModel @Inject constructor(
    private val reservationService: ReservationService
) : ViewModel(){

    //success
    private val  _reservationEvent= MutableSharedFlow<List<Reservations>>()
    val reservationEvent =_reservationEvent.asSharedFlow()

    fun ProfileInfo() {
        viewModelScope.launch {
            try {
                val response = reservationService.getReservations()
                Log.i("ReservationViewModel", "Response: $response")
                if (response.any()) {
                    _reservationEvent.emit(response)
                } else {
                    _reservationEvent.emit(listOf())
                }
            } catch (e: Exception) {
                Log.e("ReservationViewModel", "Error: ${e.message}", e)
                _reservationEvent.emit(listOf())
            }
        }
    }


}
