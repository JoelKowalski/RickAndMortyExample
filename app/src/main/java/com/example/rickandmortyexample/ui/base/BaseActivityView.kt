package com.example.rickandmortyexample.ui.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivityView : AppCompatActivity(), BaseView {

    override var basePresenter: BasePresenter<*, *>? = null

    abstract fun prepareBinding()

    abstract fun prepareView(): View?

    abstract fun setupView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prepareBinding()
        prepareView()?.let { setContentView(it) }
        setupView()
    }

}