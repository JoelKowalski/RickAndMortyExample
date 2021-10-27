package com.example.domain.dao

import androidx.room.*
import com.example.domain.Character

@Dao
interface CharacterDao {
    @Query("SELECT * FROM character")
    suspend fun getAll(): List<Character>

    @Query("SELECT * FROM character WHERE id IN (:characterIds)")
    suspend fun loadAllByIds(characterIds: List<String>): List<Character>


    @Query(
        "SELECT * FROM character WHERE id LIKE :id"
    )
    suspend fun findById(id: String, type: String): Character

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Character)


    @Delete
    suspend fun delete(character: Character)

    @Query("DELETE FROM character")
    suspend fun deleteAll()
}