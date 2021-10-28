package com.example.rickandmortyexample.ui.displayCharacters.interfaces

import com.example.domain.Character

interface OnFavoriteListFragmentListener {
    fun openCharacterDetail(character: Character)
}