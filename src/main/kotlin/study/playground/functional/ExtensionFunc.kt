package study.playground.functional

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue() : Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames : String
    get() = items.map {it.name}.joinToString()

fun main() {
    val order = Order(
        listOf(
            Item("빵", 25.0F),
            Item("와인", 29.0F),
            Item("물", 12.0F)
        ))

    println("최고 가격 물품 명 : ${order.maxPricedItemName()}")
    println("최고 가격 물품 가격 : ${order.maxPricedItemValue()}")
    println("물품들 : ${order.commaDelimitedItemNames}")
}