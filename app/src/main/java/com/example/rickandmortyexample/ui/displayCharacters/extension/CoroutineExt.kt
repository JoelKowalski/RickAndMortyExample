package com.example.rickandmortyexample.ui.displayCharacters.extension

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking


fun <T> io(block: suspend CoroutineScope.() -> T): T = runBlocking(Dispatchers.IO, block)

fun <T> main(block: suspend CoroutineScope.() -> T): T = runBlocking(Dispatchers.Main, block)
