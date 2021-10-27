package com.example.data.api

import com.example.domain.Character
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface CharacterApi {


    @GET("/character")
     fun getAllCharacters(
        @Query("page") page: Int
    ): Response<MutableList<Character>>
}
