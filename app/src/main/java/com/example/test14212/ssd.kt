package com.example.test14212

import retrofit2.http.GET

interface ssd    {
    @GET("random")
    suspend fun get_data():model_data

}