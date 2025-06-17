package com.pipeanayap.hotelapp.domain.models

data class Reservations(
    val __v: Int,
    val _id: String,
    val datetime: String,
    val idRoom: Any,
    val idServices: List<Service>,
    val idUser: Any
)