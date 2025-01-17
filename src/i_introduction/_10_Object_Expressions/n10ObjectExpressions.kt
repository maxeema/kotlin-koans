package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*

fun todoTask10(): Nothing = TODO(
    """
        Task 10.
        Read about object expressions that play the same role in Kotlin as anonymous classes in Java.

        Add an object expression that provides a comparator to sort a list in a descending order using 'java.util.Collections' class.
        In Kotlin you use Kotlin library extensions instead of java.util.Collections,
        but this example is still a good demonstration of mixing Kotlin and Java code.
    """,
    documentation = doc10()
)

//fun task10(): List<Int> = arrayListOf(1, 5, 2).sortedDescending()
//fun task10(): List<Int> = arrayListOf(1, 5, 2).apply { sortWith(Comparator { n1, n2 -> n2 - n1 }) }
fun task10(): List<Int> {
    val list = arrayListOf(1, 5, 2)
//    list.sortWith( Comparator { n1:Int, n2:Int -> n2 - n1 })
    Collections.sort(list, object : Comparator<Int> {
        override fun compare(n1: Int, n2: Int) = n2 - n1
    })
//    Collections.sort(list) {n1, n2 -> n2 - n1 }
    return list
}
