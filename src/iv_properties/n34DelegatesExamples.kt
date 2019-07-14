package iv_properties

import util.TODO
import util.doc34
import kotlin.random.Random

class LazyPropertyUsingDelegates(initializer: () -> Int) {
//    val lazyValue: Int by lazy(initializer)
    val lazyValue: Int by lazy {
        initializer().apply {
            println("- lazyValue initializing with $this")
        }
    }
    val value
        get() = System.currentTimeMillis()
}

fun main() {
    println("in main: 1")
    LazyPropertyUsingDelegates {
        Random.nextInt(Int.MAX_VALUE).apply {
            println("Random nextInt $this")
        }
    }.apply {
        println("in main: 2")
        println("value $value")
        println("lazyValue $lazyValue")
        println("in main: 3")
        println("value $value")
        println("lazyValue $lazyValue")
    }
    println("in main: 4")
}

fun todoTask34(): Lazy<Int> = TODO(
    """
        Task 34.
        Read about delegated properties and make the property lazy by using delegates.
    """,
    documentation = doc34()
)
