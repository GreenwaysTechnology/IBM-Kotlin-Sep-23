package com.ibm.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

//suspend functions are functions which are called for async operations
suspend fun delayTask() {
    println("Delay Task runs in ${Thread.currentThread().name}")
}

fun main() {
    println("Main Thread ${Thread.currentThread().name}")
    //Get the Co-Routine
    GlobalScope.launch {
        delayTask()
    }
    Thread.sleep(5000)
}