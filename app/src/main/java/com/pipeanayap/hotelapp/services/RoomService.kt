package com.pipeanayap.hotelapp.services

import com.pipeanayap.hotelapp.domain.models.Auth
import com.pipeanayap.hotelapp.domain.models.Room
import retrofit2.http.Body
import retrofit2.http.GET

interface RoomService {
    @GET("rooms")
    suspend fun getRooms() : List<Room>
}