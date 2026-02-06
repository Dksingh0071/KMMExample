package com.deepak.android.kmmexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.platform.LocalConfiguration
import android.app.Activity
import androidx.compose.runtime.remember
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
          App(
            systemUiController = rememberSystemUiController(),
            screenInfoProvider = rememberScreenInfoProvider()
          )
        }
    }
}
@Composable
fun rememberSystemUiController(): SystemUiController {
  val activity = androidx.compose.ui.platform.LocalView.current.context as Activity
  return remember(activity) { SystemUiController(activity) }
}

@Composable
fun rememberScreenInfoProvider(): ScreenInfoProvider {
  return remember { ScreenInfoProvider() }
}


actual class ScreenInfoProvider {
  @Composable
  actual fun get(): ScreenInfo {
    val config = LocalConfiguration.current
    return ScreenInfo(
      widthDp = config.screenWidthDp,
      heightDp = config.screenHeightDp,
      isLandscape = config.screenWidthDp > config.screenHeightDp
    )
  }
}

actual class SystemUiController(
  private val activity: Activity
) {
  actual fun setLightStatusBar(isLight: Boolean) {
    val window = activity.window
    val controller =
      WindowInsetsControllerCompat(window, window.decorView)
    controller.isAppearanceLightStatusBars = isLight
  }
}

