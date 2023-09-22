package com.ibm.kotlin.oo.destructruing


fun main() {
    var user = User(id = 1, name = "Subramanian", city = "Coimbatore")
    //property access without Destructuring
    println("${user.id} ${user.name} ${user.city}")
    //With DeStructuring
    var (id, name, city) = User(id = 1, name = "Subramanian", city = "Coimbatore")
    println("$id $name $city")

}