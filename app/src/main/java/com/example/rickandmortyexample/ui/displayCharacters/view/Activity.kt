package com.example.rickandmortyexample.ui.displayCharacters.view

import com.example.domain.Character
import com.example.rickandmortyexample.ui.displayCharacters.presenter.CharacterPresenter

class Activity : CharacterView() {


    override fun getCharacters(result: MutableList<Character>?) {
        TODO("Not yet implemented")
    }


    override fun setupView() {
        presenter = CharacterPresenter(this)
    }
}