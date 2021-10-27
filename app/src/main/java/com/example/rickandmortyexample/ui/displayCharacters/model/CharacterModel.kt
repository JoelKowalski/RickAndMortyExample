package com.example.rickandmortyexample.ui.displayCharacters.model

import com.example.domain.Character
import com.example.rickandmortyexample.ui.base.BaseModel
import com.example.rickandmortyexample.ui.displayCharacters.extension.io
import com.example.usecase.AllCharacterGetter

class CharacterModel: BaseModel() {

    private lateinit var cha: AllCharacterGetter

    fun getCharacters(callback: (response: MutableList<Character>?) -> Unit) {
        io {
            val conversation = cha.invoke(2)
            callback(conversation)
        }
    }
}
