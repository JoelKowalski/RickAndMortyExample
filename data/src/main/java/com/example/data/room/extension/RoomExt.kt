package com.example.data.room.extension

import android.content.Context
import androidx.room.Room
import com.example.data.DataManager
import com.example.data.room.AppDatabase
import kotlin.reflect.KClass

/**
 * Initializes Room database
 */
fun KClass<AppDatabase>.initDatabase(context: Context, databaseName: String): AppDatabase {
    DataManager.database = Room.databaseBuilder(
        context,
        this.java, databaseName
    ).build()
    return DataManager.database
}