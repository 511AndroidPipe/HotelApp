package com.pipeanayap.hotelapp.di

import com.pipeanayap.hotelapp.services.AuthService
import com.pipeanayap.hotelapp.services.RoomService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    const val BASE_URL = "https://hotelapi-8vjr.onrender.com/"


    @Provides
    @Singleton
    fun providesRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesAuthService(retrofit: Retrofit): AuthService {
        return retrofit.create(AuthService::class.java)
    }


    //Provider de el servicio de reservation
    @Provides
    @Singleton
    fun providesReservationService(retrofit: Retrofit): RoomService {
        return retrofit.create(RoomService::class.java)
    }

    @Provides
    @Singleton
    fun providesPayService(retrofit: Retrofit): RoomService {
        return retrofit.create(RoomService::class.java)
    }

}