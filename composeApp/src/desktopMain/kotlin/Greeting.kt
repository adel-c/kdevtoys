import com.ace.devtoys.Greeter

class Greeting:Greeter {
    private val platform = getPlatform()

    override  fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}
