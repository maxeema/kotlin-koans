package iv_properties

import util.TODO

class LazyProperty(val initializer: () -> Int) {
    private var value : Int? = null
    val lazy: Int
        get() = value ?: initializer().apply { value = this }
}

fun todoTask33(): Nothing = TODO(
    """
        Task 33.
        Add a custom getter to make the 'lazy' val really lazy.
        It should be initialized by the invocation of 'initializer()'
        at the moment of the first access.
        You can add as many additional properties as you need.
        Do not use delegated properties yet!
    """,
    references = { LazyProperty({ 42 }).lazy }
)
