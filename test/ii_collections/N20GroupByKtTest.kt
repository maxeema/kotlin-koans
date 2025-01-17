package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.shop
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N20GroupByKtTest {
    @Test
    fun testGroupCustomersByCity() {
        println("shop: ${shop.customers.groupBy { it.city} }")
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
