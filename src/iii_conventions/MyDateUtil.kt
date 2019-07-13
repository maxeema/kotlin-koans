package iii_conventions

import iii_conventions.TimeInterval.*
import java.util.*

fun MyDate.nextDay() = addTimeIntervals(DAY, 1)

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int) = c.clone().let { it as Calendar }.run {
    add(when (timeInterval) {
        WEEK -> Calendar.WEEK_OF_MONTH
        YEAR -> Calendar.YEAR
        else -> Calendar.DAY_OF_MONTH
    }, number)
    MyDate(get(Calendar.YEAR), get(Calendar.MONTH), get(Calendar.DATE))
}
