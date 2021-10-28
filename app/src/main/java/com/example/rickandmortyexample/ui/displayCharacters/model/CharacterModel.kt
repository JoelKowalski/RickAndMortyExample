package com.example.rickandmortyexample.ui.displayCharacters.model

import com.example.data.repository.CharacterRepository
import com.example.domain.Character
import com.example.rickandmortyexample.ui.base.BaseModel
import com.example.rickandmortyexample.ui.displayCharacters.extension.io

class CharacterModel: BaseModel() {

    private lateinit var characterRepository: CharacterRepository

    fun getCharacters(callback: (response: List<Character>?) -> Unit) {
        characterRepository = CharacterRepository()
        io {
            val characters = characterRepository.remote.getCharacters(1)
            callback(characters)
        }
    }
}
