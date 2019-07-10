package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts
    get() = orders.flatMap { it.products }.toSet()

val Shop.allOrderedProducts
    get() = customers.flatMap { it.orderedProducts }.toSet()
//    get() = customers.flatMap { it.orders.flatMap { it.products} }.toSet()
