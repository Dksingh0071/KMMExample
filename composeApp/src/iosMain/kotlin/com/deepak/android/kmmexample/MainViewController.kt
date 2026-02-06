package com.deepak.android.kmmexample

import androidx.compose.ui.window.ComposeUIViewController
import androidx.compose.runtime.Composable
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIScreen

fun MainViewController() = ComposeUIViewController { App(
  systemUiController = SystemUiController(),
  screenInfoProvider = ScreenInfoProvider()
)}



actual class ScreenInfoProvider {
  @OptIn(ExperimentalForeignApi::class)
  @Composable
  actual fun get(): ScreenInfo {
    val bounds = UIScreen.mainScreen.bounds
    return ScreenInfo(
      widthDp = 360,
      heightDp = 720,
      isLandscape = false
    )
  }
}

actual class SystemUiController {
  actual fun setLightStatusBar(isLight: Boolean) {
    // TODO: iOS status bar handling or no-op
  }
}
