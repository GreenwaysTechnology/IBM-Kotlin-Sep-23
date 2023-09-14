fun save(name: String? = "", city: String? = "", age: Int? = 1) {
    println("${name?.uppercase() ?: "Name".uppercase()} ${city?.uppercase() ?: "City".uppercase()} ${age ?: 1}")
}

fun find(): String? {
    //return "find";
    return null
}


fun main() {
    save(name = "Subramanian", city = "Coimbatore", age = 43)
    save(name = null, city = null, age = null)
    println(find() ?: "empty")
}