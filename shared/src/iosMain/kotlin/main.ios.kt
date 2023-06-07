import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController { App() }

