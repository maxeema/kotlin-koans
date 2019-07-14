package v_builders.examples

fun todoTask38(): Nothing = TODO(
    """
        Task 38.
        The previous examples can be rewritten with the library function 'apply' (see examples below).
        Write your own implementation of the function 'apply' named 'myApply'.
    """
)

fun buildString(): String
    = StringBuilder().myApply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()

fun <T> T.myApply(block: T.()->Unit) : T = apply(block)

fun buildMap(): Map<Int, String>
    = hashMapOf<Int, String>().myApply {
        (0..10).forEach { i-> put(i, "$i") }
    }