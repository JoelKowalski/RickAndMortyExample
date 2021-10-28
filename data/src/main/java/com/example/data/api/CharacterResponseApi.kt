package com.example.data.api

import com.example.domain.Character
import com.google.gson.annotations.SerializedName

data class CharacterResponseApi(
    @SerializedName("results") val results: List<Character>
)