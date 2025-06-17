package com.pipeanayap.hotelapp.services

import com.pipeanayap.hotelapp.domain.models.Reservations
import retrofit2.http.GET

interface ReservationService {

    @GET("reservations")
    suspend fun getReservations(): List<Reservations>

}