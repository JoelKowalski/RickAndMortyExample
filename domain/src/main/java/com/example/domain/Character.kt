package com.example.domain

import com.google.gson.annotations.SerializedName

class Character {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("status")
    var status: String = ""

    @SerializedName("species")
    var species: String = ""

    @SerializedName("gender")
    var gender: String = ""

    @SerializedName("origin")
    var Origin: Origin? = null

    @SerializedName("location")
    var Location: Location? = null

    @SerializedName("image")
    var image: String = ""

}