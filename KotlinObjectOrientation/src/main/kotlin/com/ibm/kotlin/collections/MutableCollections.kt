package com.ibm.kotlin.collections

fun main() {
    var list = mutableListOf<Int>(1, 2, 3)
    list.forEach { println(it) }
    list.add(13)
    list.add(33)
    list.forEach { println(it) }
    //using scope functions
    mutableListOf<Int>(1, 2, 3).apply {
        add(33)
        add(34)
    }.apply {
        println("Before Sorting")
        forEach { println(it) }
    }.apply {
        sortByDescending { it }
    }.apply {
        println("After Sorting")
        forEach { println(it) }
    }

}