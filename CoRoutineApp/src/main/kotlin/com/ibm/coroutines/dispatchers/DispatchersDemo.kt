package com.ibm.coroutines.dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

suspend fun get() {
    withContext(Dispatchers.IO) {
        println("IO TASKS SUCH NETWORK APICALLS")
        println(Thread.currentThread().name)
    }
}

fun main() {
    runBlocking {
        launch {
            get()
        }
    }
}