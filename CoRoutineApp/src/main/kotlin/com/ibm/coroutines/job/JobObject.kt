package com.ibm.coroutines.job

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        var job: Job = GlobalScope.launch {
            //async task
            delay(1000)
            println("hello")
        }
        //join with main thread
        job.join()
        println("done")
    }
}