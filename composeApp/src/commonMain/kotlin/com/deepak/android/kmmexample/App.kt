package com.deepak.android.kmmexample

import WalletAnimation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(systemUiController: SystemUiController,
        screenInfoProvider: ScreenInfoProvider) {
  MaterialTheme {
    WalletAnimation(
      systemUiController = systemUiController,
      screenInfoProvider = screenInfoProvider
    )
  }
}