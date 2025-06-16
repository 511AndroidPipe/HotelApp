package com.pipeanayap.hotelapp.domain.models

import com.google.gson.annotations.SerializedName

data class Room(
    @SerializedName("_id") val id: String,
    val img: String,
    val type: String,
    val status: String,
    val price: Int,
    val services: List<Service>
)