package com.pipeanayap.hotelapp.services

import com.pipeanayap.hotelapp.domain.dtos.AuthResponse
import com.pipeanayap.hotelapp.domain.models.Auth
import com.pipeanayap.hotelapp.domain.models.Register
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthService {

    @POST("login")
    suspend fun login(@Body auth : Auth) : AuthResponse

    @POST("users")
    suspend fun register(@Body register: Register) : AuthResponse



}

