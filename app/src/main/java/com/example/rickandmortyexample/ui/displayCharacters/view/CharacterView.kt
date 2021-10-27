package com.example.rickandmortyexample.ui.displayCharacters.view

import android.view.View
import com.example.domain.Character
import com.example.rickandmortyexample.ui.base.BaseActivityView
import com.example.rickandmortyexample.ui.displayCharacters.presenter.CharacterPresenter

abstract class CharacterView : BaseActivityView() {

    /**
     * View binding, using none: this screen doesn't have layout
     */
    override fun prepareBinding() {
        // nothing to do here
    }

    override fun prepareView(): View? = null

    /**
     * Presenter, using [SplashPresenter]
     */
    var presenter: CharacterPresenter
        set(value) {
            basePresenter = value
        }
        get() = when (basePresenter) {
            null -> throw Exception("Presenter not initialized")
            else -> basePresenter!! as CharacterPresenter
        }

    abstract fun getCharacters(result: MutableList<Character>?)
}