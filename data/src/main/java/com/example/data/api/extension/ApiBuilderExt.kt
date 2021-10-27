package com.example.data.api.extension

import com.example.data.api.ApiBuilder

inline fun <reified T> buildApi(): T {

    return ApiBuilder.create( )
}