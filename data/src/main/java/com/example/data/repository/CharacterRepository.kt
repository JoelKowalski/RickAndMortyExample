package com.example.data.repository

import com.example.data.DataManager
import com.example.data.api.CharacterApi
import com.example.data.api.extension.buildApi
import com.example.data.repository.base.BaseRepository
import com.example.data.repository.base.LocalRepository
import com.example.data.repository.base.RemoteRepository
import com.example.data.repository.extension.error
import com.example.domain.Character

class CharacterRepository : BaseRepository() {

    override val local = Local()
    override val remote = Remote()

    class Local : LocalRepository() {

        private var characterDao = DataManager.database.favCharacter()


        /**
         * Stores the given character
         */
        suspend fun saveFavCharacter(
            character: Character
        ) = characterDao.insert(character)

        /**
         * Removes the character
         */
        suspend fun removeFavCharacter(
            character: Character
        ) = characterDao.delete(character)
    }

    class Remote : RemoteRepository() {
        private val characterApi: CharacterApi = buildApi()

        suspend fun getCharacters(page:Int): List<Character>? {
            var characterList: List<Character>? = null

            val response = characterApi.getAllCharacters(page)
            if (response.isSuccessful){
                characterList = response.body()?.results
            }
            return characterList

        }
    }
}


