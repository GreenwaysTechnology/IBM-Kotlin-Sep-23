class CustomerService {

    //functions / methods
    fun findAll(): String {
        return "findAll"
    }

    fun save(employee: String?): String? {
        return "saved"
    }

    //single function expression
    fun remove(id: Int?) = "$id Removed"
}

fun main() {
    var customerService = CustomerService()
    println(customerService.findAll())
    println(customerService.save("employee"))
    println(customerService.remove(1))
}