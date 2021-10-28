package com.example.rickandmortyexample.ui.displayCharacters.extension

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlin.reflect.KClass

fun <A : Activity> Activity.startActivityWithExtra(activity: KClass<A>,bundle: Bundle) {
    Intent(this, activity.java).also {
        startActivity(it,bundle)
    }
}