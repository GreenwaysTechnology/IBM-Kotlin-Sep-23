package com.ibm.kotlin.oo.companions

class Welcome {

    //companion is used to declare static memebers
    companion object {
        //act as static methods, in Kotlin there is no static keyword
        fun createInstance(): Welcome = Welcome()
        var MESSAGE = "HELLO"
        var INFO = "INFO"
    }

    fun sayHello() = "Welcome"
}

fun main() {
    var welcome = Welcome.createInstance()
    println(welcome.sayHello())
    println(Welcome.MESSAGE)
    println(Welcome.INFO)

}