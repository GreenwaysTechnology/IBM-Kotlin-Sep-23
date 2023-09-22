class Address(var street: String = "street", var city: String = "City") {}

//Here client has a Address
class Client(var id: Int = 0, var name: String = "Name", var address: Address = Address()) {}

fun main() {
    var client = Client(
        id = 1,
        name = "Subramanian",
        address = Address(
            street = "10th Street",
            city = "Coimbatore"
        )
    )
    println("${client.id} ${client.name} ${client.address.city} ${client.address.street} ")
}