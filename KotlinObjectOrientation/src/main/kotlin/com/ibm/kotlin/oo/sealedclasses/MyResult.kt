package com.ibm.kotlin.oo.sealedclasses

sealed class MyResult {
    //INNER Classes
    data class Success(val resolve: String) : MyResult()
    data class Failure(val reject: String) : MyResult()
    data class Loader(val loading: String) : MyResult()
}

fun getSuccess(): MyResult {
    return MyResult.Success("Success")
}

fun getFailure(): MyResult {
    return MyResult.Failure("Failed")
}

fun getResponse(status: Int = 200): MyResult {
    if (status == 200) return MyResult.Success("Response found")
    return MyResult.Failure("Response Not found")
}

fun main() {
    var status = getSuccess()
    when (status) {
        is MyResult.Success -> {
            println(status.resolve)
        }
        is MyResult.Failure -> {
            println(status.reject)
        }
        else -> {
            println("Loading...")
        }
    }
    status = getFailure()
    when (status) {
        is MyResult.Success -> {
            println(status.resolve)
        }
        is MyResult.Failure -> {
            println(status.reject)
        }
        else -> {
            println("Loading...")
        }

    }
    status = getResponse(500)
    when (status) {
        is MyResult.Success -> {
            println(status.resolve)
        }
        is MyResult.Failure -> {
            println(status.reject)
        }
        else -> {
            println("Loading...")
        }

    }
}