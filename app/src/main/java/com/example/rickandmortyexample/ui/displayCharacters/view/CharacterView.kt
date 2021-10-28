package com.example.rickandmortyexample.ui.displayCharacters.view

import android.view.View
import com.example.domain.Character
import com.example.rickandmortyexample.databinding.ActivityMainBinding
import com.example.rickandmortyexample.ui.base.BaseActivityView
import com.example.rickandmortyexample.ui.base.BindInterface
import com.example.rickandmortyexample.ui.displayCharacters.presenter.CharacterPresenter

abstract class CharacterView : BaseActivityView() , BindInterface<ActivityMainBinding> {

    /**
     * View binding, using [ActivityMainBinding]
     */
    override var binding: ActivityMainBinding? = null
    override var view: ActivityMainBinding
        get() = binding ?: throw Exception("View binding not initialized yet")
        set(value) {
            binding = value
        }

    override fun prepareBinding() {
        view = ActivityMainBinding.inflate(layoutInflater)
    }

    override fun prepareView(): View {
        return view.root
    }

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

    abstract fun prepareCharacters(result: List<Character>)

    abstract fun goToDetail()
}