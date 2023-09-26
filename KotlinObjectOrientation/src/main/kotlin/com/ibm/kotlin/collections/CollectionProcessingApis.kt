package com.ibm.kotlin.collections

fun transform() {
    listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).let {
        println("Before Processing")
        it.forEach { println(it) }
        it
    }.let {
        //double the no
        it.map { it * 2 } //this should be returned
    }.let {
        println("After Processing")
        it.forEach { println(it) }
    }
}

fun filter() {
    listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).let {
        it.filter { it % 2 === 0 }
    }.let {
        it.forEach { println(it) }
    }
}

fun main() {
    //transform()
    filter()
}