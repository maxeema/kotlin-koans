package iii_conventions.multiAssignemnt

import util.TODO
import util.doc30
import java.util.*

fun todoTask30(): Nothing = TODO(
    """
        Task 30.
        Read about destructuring declarations and make the following code compile by adding one 'data' modifier.
    """,
    documentation = doc30()
)

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {
    val (year, month, dayOfMonth) = date
    // 29 February of a leap year
    return isLeapYear(year) && month == Calendar.FEBRUARY && dayOfMonth == 29
}

// Years which are multiples of four (with the exception of years divisible by 100 but not by 400)
fun isLeapYear(year: Int): Boolean = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)