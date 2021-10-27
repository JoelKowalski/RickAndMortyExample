package com.example.rickandmortyexample.ui.base

import androidx.databinding.ViewDataBinding

interface BindInterface<T : ViewDataBinding> {
    var binding: T?
    var view: T
}