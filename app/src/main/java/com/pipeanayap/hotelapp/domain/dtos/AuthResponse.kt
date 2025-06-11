package com.pipeanayap.hotelapp.domain.dtos


//Reponse del login
data class AuthResponse(
    val message : String,
    val role : List<String>
)
