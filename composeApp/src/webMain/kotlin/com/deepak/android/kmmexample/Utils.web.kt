package com.deepak.android.kmmexample

import androidx.compose.runtime.Composable
import kotlinx.browser.window

actual class ScreenInfoProvider {

  @Composable
  actual fun get(): ScreenInfo {
    val width = window.innerWidth
    val height = window.innerHeight

    return ScreenInfo(
      widthDp = width,
      heightDp = height,
      isLandscape = width > height
    )
  }
}

actual class SystemUiController {
  actual fun setLightStatusBar(isLight: Boolean) {
  }
}