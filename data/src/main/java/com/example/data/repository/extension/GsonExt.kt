package com.example.data.repository.extension

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T> String.asObject(): T? =
    Gson().fromJson<T>(this, object : TypeToken<T>() {}.type)

inline fun <reified T> String.asListObject(): List<T> =
    Gson().fromJson(this, object : TypeToken<List<T>>() {}.type) ?: emptyList()

inline fun <reified T> T.asString(): String = Gson().toJson(this, object : TypeToken<T>() {}.type)