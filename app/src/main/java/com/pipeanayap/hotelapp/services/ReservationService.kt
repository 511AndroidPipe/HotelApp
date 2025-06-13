package com.pipeanayap.hotelapp.services

import com.pipeanayap.hotelapp.domain.dtos.ReservationResponse
import com.pipeanayap.hotelapp.domain.models.Auth
import retrofit2.http.Body
import retrofit2.http.GET

interface ReservationService {
    @GET("rooms")
    suspend fun login(@Body auth : Auth) : ReservationResponse
}