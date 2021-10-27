package com.example.rickandmortyexample.ui.base

import java.lang.Exception

abstract class BasePresenter<V : BaseView, M : BaseModel>(private var _view: V? = null) {

    val view: V
        get() = when (_view) {
            null -> throw Exception("view not initialized")
            else -> _view!!
        }

    abstract val model: M

    fun setView(view: V) {
        this._view = view
    }
}