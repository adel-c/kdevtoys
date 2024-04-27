import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ace.devtoys.App
import com.ace.devtoys.Greeter


//actual val greeter:Greeter=Greeting()
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kdevtoys",
    ) {
        App()
    }
}
