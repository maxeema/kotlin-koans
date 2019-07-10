package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City) = this.city == city

fun Shop.checkAllCustomersAreFrom(city: City) = customers.all { it.city == city }
//fun Shop.checkAllCustomersAreFrom(city: City) = customers.isNotEmpty() && !customers.any { it.city != city }

fun Shop.hasCustomerFrom(city: City) = customers.any { it.city == city}

fun Shop.countCustomersFrom(city: City) = customers.count { it.city == city }

fun Shop.findFirstCustomerFrom(city: City) = customers.firstOrNull { it.city == city }
