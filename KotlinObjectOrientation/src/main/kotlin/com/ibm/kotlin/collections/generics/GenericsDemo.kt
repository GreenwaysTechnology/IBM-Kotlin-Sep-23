package com.ibm.kotlin.collections.generics

data class Customer(val id: Int = 1, val name: String = "Subramanian")
data class Employee(val id: Int = 1, val name: String = "")

interface Repository<T> {
    fun <T> getById(id: Int): T
    fun <E> getAll(): List<T>
}

class RespositoryImpl<T> : Repository<T> {
    override fun <E> getAll(): List<T> {
        TODO("Not yet implemented")
    }

    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }
}

fun main() {
    //customer Object
    var customers = RespositoryImpl<Customer>()
    customers.getAll<Employee>()
    customers.getById<Employee>(1)
    var employees = RespositoryImpl<Employee>()
    employees.getById<Customer>(3)
    employees.getAll<Customer>()
}