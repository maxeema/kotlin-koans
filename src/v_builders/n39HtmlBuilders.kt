package v_builders

import util.TODO
import util.doc39
import v_builders.data.getProducts
import v_builders.htmlLibrary.*

fun getTitleColor() = "#b9c9fe"
fun getCellColor(row: Int, column: Int) = if ((row + column) % 2 == 0) "#dce4ff" else "#eff2ff"

fun todoTask39(): Nothing = TODO(
    """
        Task 39.
        1) Fill the table with the proper values from products.
        2) Color the table like a chess board (using getTitleColor() and getCellColor() functions above).
        Pass a color as an argument to functions 'tr', 'td'.
        You can call the 'main' function in the 'htmlDemo.kt' to see the rendered table.
    """,
    documentation = doc39()
)

fun renderProductTable()
    = html {
        table {
            tr(getTitleColor()) {
                td { text("Product") }
                td { text("Price") }
                td { text("Popularity") }
            }
            getProducts().forEachIndexed { idx, prod -> with (prod) {
            tr {
                td(getCellColor(idx, 1)) { text(description) }
                td(getCellColor(idx, 2)) { text(price) }
                td(getCellColor(idx, 3)) { text(popularity) }
            }}}
        }
    }.toString()
