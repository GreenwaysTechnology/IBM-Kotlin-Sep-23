package com.ibm.kotlin.collections

data class Customer(val id: Int = 1, val name: String = "")
data class Employee(val id: Int = 1, val name: String = "")

interface CustomerRepository {
    val isEmpty: Boolean get() = true
    fun store(obj: Customer) {
        //implement code how to store
    }

    fun getById(id: Int): Customer
}

interface EmployeeReposiotry {
    val isEmpty: Boolean get() = true
    fun store(obj: Employee) {
        //implement code how to store
    }

    fun getById(id: Int): Employee
}

//implementation classes
class CustomerRepsitoryImpl : CustomerRepository {
    override fun getById(id: Int): Customer {
        TODO("Not yet implemented")
    }

    override val isEmpty: Boolean
        get() = super.isEmpty

    override fun store(obj: Customer) {
        super.store(obj)
    }
}

class EmployeeRepsitoryImpl : EmployeeReposiotry {
    override fun getById(id: Int): Employee {
        TODO("Not yet implemented")
    }

    override val isEmpty: Boolean
        get() = super.isEmpty

    override fun store(obj: Employee) {
        super.store(obj)
    }
}

fun main() {
    var customerRepository = CustomerRepsitoryImpl()
    println(customerRepository.isEmpty)
    var employeeReposiotry = EmployeeRepsitoryImpl()
    println(employeeReposiotry.isEmpty)
}