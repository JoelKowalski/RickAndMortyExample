package com.example.rickandmortyexample.ui.displayCharacters.presenter

import com.example.rickandmortyexample.ui.base.BasePresenter
import com.example.rickandmortyexample.ui.displayCharacters.model.CharacterModel
import com.example.rickandmortyexample.ui.displayCharacters.view.CharacterView


abstract class BaseCharacterPresenter(view: CharacterView) : BasePresenter<CharacterView, CharacterModel>(view) {
    override val model = CharacterModel()

    abstract fun getCharacters()
}