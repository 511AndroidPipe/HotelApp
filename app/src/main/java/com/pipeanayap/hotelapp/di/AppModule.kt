package com.pipeanayap.hotelapp.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    const val BASE_URL = "https://hotelapi-8vjr.onrender.com"


}