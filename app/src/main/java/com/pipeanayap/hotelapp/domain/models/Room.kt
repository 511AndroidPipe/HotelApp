package com.pipeanayap.hotelapp.domain.models

data class Room(
    val _id: String,
    val img: String,
    val type: String,
    val status: String,
    val price: Int,
    val services: List<Service>
)


