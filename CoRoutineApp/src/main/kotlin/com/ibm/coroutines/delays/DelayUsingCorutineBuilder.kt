package com.ibm.coroutines.delays

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//suspend functions are functions which are called for async operations
suspend fun delayTask() {
    //Thread.sleep(1000)
    delay(1000)
    println("Delay Task runs in ${Thread.currentThread().name}")
}

fun main() {
    runBlocking {
        println("Main Thread ${Thread.currentThread().name}")
        //Get the Co-Routine
        GlobalScope.launch {
            delayTask()
        }
        delay(10000)
    }
}