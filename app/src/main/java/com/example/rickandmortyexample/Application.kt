package com.example.rickandmortyexample

import android.app.Application
import com.example.data.room.AppDatabase
import com.example.data.room.extension.initDatabase

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        CoreManager.init(applicationContext)
        AppDatabase::class.initDatabase(applicationContext, "my_database")
    }
}