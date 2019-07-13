package iii_conventions

import java.util.*

class DateRange(override val start: MyDate, override val endInclusive: MyDate)
        : ClosedRange<MyDate>, Iterable<MyDate>, Iterator<MyDate> {

    private var next = start

    override operator fun hasNext() = next <= endInclusive
    override operator fun next() = next.let { next = next.nextDay(); it }

    override operator fun iterator() = this
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate> {

    internal val c = Calendar.getInstance().apply { clear(); set(year, month, dayOfMonth) }

    override operator fun compareTo(other: MyDate) = c.compareTo(other.c)

}
operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)
operator fun MyDate.plus(t: TimeInterval) = this.addTimeIntervals(TimeInterval.DAY, t.days)

open class TimeInterval(val days: Int) {
    object DAY : TimeInterval(1)
    object WEEK: TimeInterval(7)
    object YEAR: TimeInterval(365)
}
operator fun TimeInterval.times(value: Int) = TimeInterval(value * days)

