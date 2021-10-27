package com.example.usecase

import com.example.data.repository.CharacterRepository
import com.example.domain.Character

abstract class AllCharacterGetter (
    private val characterRepository: CharacterRepository
) {
     fun invoke(page: Int): MutableList<Character> =
         characterRepository.remote.getCharacters(page)
}
