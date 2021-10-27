package com.example.data.repository.extension

import com.example.data.repository.RequestError
import retrofit2.Response

fun Response<*>.error() = this.errorBody()?.string()?.asObject<RequestError>()