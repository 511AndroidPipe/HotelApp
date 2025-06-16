package com.pipeanayap.hotelapp.domain.models

import com.google.gson.annotations.SerializedName

data class Service(
    @SerializedName("_id")  val id: String,
    val img: String,
    val name: String,
    val price: Int,
    val description: String
)