package ii_collections

fun example6() {
    listOf(1, 3).sum() == 4
    listOf("a", "b", "cc").sumBy { it.length } == 4
}

fun Customer.getTotalOrderPrice() =
    orders.sumByDouble { it.products.sumByDouble { it.price } }
//    orders.flatMap { it.products }.sumByDouble { it.price }
