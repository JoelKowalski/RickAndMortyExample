package com.example.rickandmortyexample.ui.displayCharacters.adapters

interface RAdapter<T> {
    val list: MutableList<T>
    fun updateContent(list: List<T>)
}