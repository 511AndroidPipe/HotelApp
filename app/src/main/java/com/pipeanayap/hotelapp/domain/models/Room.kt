package com.pipeanayap.hotelapp.domain.models

import com.google.gson.annotations.SerializedName

data class Room(
    val __v: Int,
    @SerializedName("_id") val _id: String,
    val price: Int,
    val status: String,
    val type: String,
    val image: String
)