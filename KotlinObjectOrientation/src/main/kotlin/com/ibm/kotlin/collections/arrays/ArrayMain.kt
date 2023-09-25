package com.ibm.kotlin.collections.arrays

fun main() {
    //factory api
    var myIntArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println(myIntArray.get(0))
    //log all values
    myIntArray.iterator().forEach { println(it) }

    //not recommened
    //constructors
    var counters = IntArray(5)
    counters.set(0, 1)
    counters.set(1, 2)
    counters.forEach { println(it) }
    //Constructor
    var strArray = Array(3, { i -> "hello ${i}" })
    strArray.iterator().forEach { println(it) }

    //generic api
    arrayOf<String>("Kotlin","Java","Scala").let {
        it.forEach { println(it) }
    }
}