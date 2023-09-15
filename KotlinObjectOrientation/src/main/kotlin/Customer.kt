class Customer {
    //data and operations
    //var id: Int = 0
    //null if want
    var id: Int? = null
    var name: String? = null
    var city: String? = null
}

fun main() {
    //Expclit type
    var customer: Customer = Customer()
    //Type inference
    var customerOne = Customer()

    //How to access properties
    println("id ${customer.name} Name ${customer.name} ${customer.city}")
}