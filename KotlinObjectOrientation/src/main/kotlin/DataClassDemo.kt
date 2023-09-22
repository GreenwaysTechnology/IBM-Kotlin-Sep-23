//data class Product(val id: Int, val name: String, val price: Double){}
data class Product(val id: Int, val name: String, val price: Double)

fun main() {
    var product1 = Product(1, "IPHONE 15", 135000.00)
    var product2 = Product(2, "IPHONE 15", 135000.00)
    println(product1.toString())
    println(product1.hashCode())
    println(product1 == product2)
    var product3 = product2.copy(id = 3, name = "IPHONE I5 Pro")
    println(product3.toString())

}

