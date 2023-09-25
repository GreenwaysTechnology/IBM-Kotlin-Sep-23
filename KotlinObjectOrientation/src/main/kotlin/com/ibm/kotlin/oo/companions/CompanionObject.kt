package com.ibm.kotlin.oo.companions

class Greetings {
      object Factory {
        fun createInstance(): Greetings = Greetings()
    }
}

fun main() {
    println(Greetings.Factory.createInstance().hashCode())
    println(Greetings.Factory.createInstance().hashCode())

}