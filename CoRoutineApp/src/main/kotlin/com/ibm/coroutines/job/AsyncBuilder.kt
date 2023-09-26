package com.ibm.coroutines.job

import kotlinx.coroutines.*;

fun main() {
    runBlocking {
        var job: Deferred<String> = async {
            delay(1000) //after 1000 ms return hello
            "Hello " //value to be returned
        }
        job.join()
        println(job.await())
    }
}