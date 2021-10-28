package com.example.rickandmortyexample.ui.displayCharacters.presenter

import com.example.rickandmortyexample.ui.displayCharacters.view.CharacterView

class CharacterPresenter (view: CharacterView) : BaseCharacterPresenter(view) {

    init {
        getCharacters()
    }

    override fun getCharacters() {
        model.getCharacters { view.prepareCharacters(it!!) }
    }
}