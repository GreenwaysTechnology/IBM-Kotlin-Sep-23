package com.ibm.coroutines

import kotlin.concurrent.thread

fun delay() {
    println("Delay task")
    println("Delay task is running at ${Thread.currentThread().name}")
}

fun main() {
    println("Main Program Starts ${Thread.currentThread().name}")
    thread(name = "My Thread") {
        delay()
    }
}