package com.deepak.android.kmmexample

import androidx.compose.runtime.Composable


actual class ScreenInfoProvider {

  @Composable
  actual fun get(): ScreenInfo {
    val width = 1280
    val height = 720

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