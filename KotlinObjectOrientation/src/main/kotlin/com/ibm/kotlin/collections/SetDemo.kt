package com.ibm.kotlin.collections

fun main() {
    mutableSetOf<Int>(1, 2, 3, 4, 5).apply {
        add(1)
        add(2)
        add(10)
        add(4)
    }.apply {
        forEach { println(it) }
    }
}