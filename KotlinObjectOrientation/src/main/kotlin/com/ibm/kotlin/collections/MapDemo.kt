package com.ibm.kotlin.collections


fun main() {
    mutableMapOf<String, Int>("value1" to 100, "value2" to 200).apply {
        values.forEach { println(it) }
        keys.forEach { println(it) }
    }
}
