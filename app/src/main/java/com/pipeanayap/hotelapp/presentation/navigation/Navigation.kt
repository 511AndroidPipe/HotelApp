package com.pipeanayap.hotelapp.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Screens(){
    @Serializable
    object LoginScreenRoute : Screens()

    @Serializable
    object RegisterScreenRoute : Screens()

    @Serializable
    object MainScreenRoute : Screens()


    @Serializable
    object MenuScreenRoute : Screens()


    @Serializable
    object StatsScreenRoute : Screens()


    @Serializable
    object MainGraph : Screens()

    @Serializable
    object  RoomScreenRoute : Screens()


    //Faltar rutas

}

