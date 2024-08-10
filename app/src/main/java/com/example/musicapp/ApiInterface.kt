package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers("x-rapidapi-key: 658f4a4d7cmsha0a3ffc70458fd1p10c63djsn65c8bf790690","x-rapidapi-host:  deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>
}