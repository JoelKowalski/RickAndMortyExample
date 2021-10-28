package com.example.rickandmortyexample

import android.content.Context

class CoreManager {

    companion object {

        /**
         * Initializes the application [Context]
         */
        @JvmStatic
        fun init(context: Context) {
            this.context = context
        }

        private var internalContextLambda: (() -> Context)? = null

        @JvmStatic
        var context: Context
            get() = internalContextLambda?.invoke() ?: throw Exception("Context not defined yet")
            set(value) {
                internalContextLambda = { value }
            }


    }
}
