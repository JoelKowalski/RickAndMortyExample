package com.example.data

import com.example.data.room.AppDatabase
import java.security.cert.X509Certificate

class DataManager {
    companion object {

        private var internalDatabase: AppDatabase? = null
        @JvmStatic
        var database: AppDatabase
            get() = internalDatabase ?: throw Exception("Database not defined yet")
            set(value) {
                internalDatabase = value
            }

    }
}