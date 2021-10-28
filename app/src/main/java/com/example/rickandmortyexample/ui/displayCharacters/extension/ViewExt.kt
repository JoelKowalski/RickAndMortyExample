package com.example.rickandmortyexample.ui.displayCharacters.extension

import android.view.View

inline infix fun <reified V, A> Int.lazyOn(view: A): Lazy<V> where V : View, A : View {
    return lazy(LazyThreadSafetyMode.NONE) { this.of(view) }
}

infix fun <T : View> Int.of(view: View): T {
    return view.findViewById(this)
}