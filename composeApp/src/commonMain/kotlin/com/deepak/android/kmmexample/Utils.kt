package com.deepak.android.kmmexample

import androidx.compose.runtime.Composable

// commonMain
data class ScreenInfo(
  val widthDp: Int,
  val heightDp: Int,
  val isLandscape: Boolean
)

expect class ScreenInfoProvider {
  @Composable
  fun get(): ScreenInfo
}


// commonMain
expect class SystemUiController {
  fun setLightStatusBar(isLight: Boolean)
}
