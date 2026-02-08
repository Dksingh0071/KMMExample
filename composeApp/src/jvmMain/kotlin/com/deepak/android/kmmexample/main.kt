package com.deepak.android.kmmexample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMM Example",
    ) {
        App(
          screenInfoProvider =,
          systemUiProvide =
        )
        CoroutineScope(Dispatchers.IO)
    }
}