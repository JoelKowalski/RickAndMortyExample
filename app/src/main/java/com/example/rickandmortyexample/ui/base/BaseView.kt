package com.example.rickandmortyexample.ui.base

interface BaseView {
    var basePresenter: BasePresenter<*, *>?
}