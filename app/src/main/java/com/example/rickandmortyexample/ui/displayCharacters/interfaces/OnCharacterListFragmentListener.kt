package com.example.rickandmortyexample.ui.displayCharacters.interfaces

import com.example.domain.Character

interface OnCharacterListFragmentListener {
    fun openCharacterDetail(character: Character)
}