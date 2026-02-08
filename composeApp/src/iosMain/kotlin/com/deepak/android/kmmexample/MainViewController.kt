package com.deepak.android.kmmexample

import androidx.compose.ui.window.ComposeUIViewController
import androidx.compose.runtime.Composable
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIScreen
import kotlinx.cinterop.useContents

fun MainViewController() = ComposeUIViewController { App(
  systemUiController = SystemUiController(),
  screenInfoProvider = ScreenInfoProvider()
)}



actual class ScreenInfoProvider {
  @OptIn(ExperimentalForeignApi::class)
  @Composable
  actual fun get(): ScreenInfo {
    val bounds = UIScreen.mainScreen.bounds

    return bounds.useContents {
      val widthDp = size.width.toInt()
      val heightDp = size.height.toInt()

      ScreenInfo(
        widthDp = widthDp,
        heightDp = heightDp,
        isLandscape = widthDp > heightDp
      )
    }
  }
}

actual class SystemUiController {
  actual fun setLightStatusBar(isLight: Boolean) {
    // TODO: iOS status bar handling or no-op
  }
}
