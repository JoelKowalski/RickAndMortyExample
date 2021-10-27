package com.example.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.domain.Character
import com.example.domain.dao.CharacterDao

@Database(
    entities = [Character::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favCharacter(): CharacterDao
}