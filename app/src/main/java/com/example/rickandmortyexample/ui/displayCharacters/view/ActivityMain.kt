package com.example.rickandmortyexample.ui.displayCharacters.view

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domain.Character
import com.example.rickandmortyexample.ui.displayCharacters.adapters.CharacterAdapter
import com.example.rickandmortyexample.ui.displayCharacters.interfaces.OnFavoriteListFragmentListener
import com.example.rickandmortyexample.ui.displayCharacters.presenter.CharacterPresenter

class ActivityMain : CharacterView(),OnFavoriteListFragmentListener {


    private val mAdapter = CharacterAdapter()

    override fun prepareCharacters(character: List<Character>) =
        mAdapter.updateContent(character)

    override fun goToDetail() {
        TODO("Not yet implemented")
    }

    override fun setupView() {
        presenter = CharacterPresenter(this)
        view.rvCharacterList.adapter = mAdapter
        view.rvCharacterList.layoutManager = LinearLayoutManager(this)
    }


    override fun openCharacterDetail(character: Character) {
        TODO("Not yet implemented")
    }
}