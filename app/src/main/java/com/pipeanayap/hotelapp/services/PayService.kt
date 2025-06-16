package com.pipeanayap.hotelapp.services

import com.pipeanayap.hotelapp.domain.models.Room
import retrofit2.http.GET

interface PayService {
    @GET("rooms") // ajusta el endpoint real si es distinto
    suspend fun getRooms(): List<Room>
}
