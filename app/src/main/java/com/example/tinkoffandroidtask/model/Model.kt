package com.example.tinkoffandroidtask.model

import android.net.Uri
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET


data class GIFInfo(val description: String, val gifURL: Uri)

interface DevelopersLifeService {
    @GET("random?json=true")
    fun randomGIF(): Call<GIFInfo>
}

object APIClient {

    private var service: DevelopersLifeService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://developerslife.ru/")
            .build()
        service = retrofit.create(DevelopersLifeService::class.java)
    }

    fun getNextGIFUri(): GIFInfo? {
        val call = service.randomGIF()
        return call.execute().body()
    }

}

