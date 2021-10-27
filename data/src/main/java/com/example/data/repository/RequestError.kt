package com.example.data.repository

import com.google.gson.annotations.SerializedName

class RequestError {

    @SerializedName("status")
    var status: Int = 0

    @SerializedName("error")
    var error: String = ""

    @SerializedName("message")
    var message: String = ""
}