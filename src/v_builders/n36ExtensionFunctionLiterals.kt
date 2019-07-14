package v_builders

import util.TODO
import util.doc36

fun todoTask36(): Nothing = TODO(
    """
        Task 36.
        Read about extension function literals.
        You can declare `isEven` and `isOdd` as values, that can be called as extension functions.
        Complete the declarations below.
    """,
    documentation = doc36()
)

fun task36(): List<Boolean> {
    val isOdd: Int.() -> Boolean = { this%2==1 }
    val isEven: Int.() -> Boolean = { rem(2)==0 }
    
    val sum: Short.(Short) -> Int = { other-> this + other }
    val sum2 = fun Short.(other: Short) : Int = other + this

    fun f(process: Short.()->Short) {
        val s = 10.toShort()
        println(s)
        println(s.process())
    }

    f {
        println("this $this")
        this.sum(3.toShort().sum2(5.toShort()).toShort()).toShort()
    }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}


