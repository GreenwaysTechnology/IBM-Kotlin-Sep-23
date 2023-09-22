package com.ibm.kotlin.oo.sealedclasses

import com.ibm.kotlin.oo.User
import com.ibm.kotlin.oo.message
import com.ibm.kotlin.oo.save

fun main() {
    val user = User(id = 1, name = "Subrmanian")
    println(user.toString())
    save()
    println(message)
}