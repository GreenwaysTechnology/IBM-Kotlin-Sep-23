package com.ibm.kotlin.oo.scopefunctions


data class User(var name: String, var location: String, var points: Int) {
    //biz methods
    fun updateLocation(newLocation: String) {
        location = newLocation
    }

    fun incrementPoints() {
        points++
    }

}

fun main() {
    var user = User(name = "Subramanian", location = "Coimbatore", points = 100)
    //access the properties of object using reference value
    println("Location ${user.location}")
    println("Name${user.name}")
    println("Points ${user.points}")
    user.updateLocation("Chennai")
    user.incrementPoints()
    println("Name${user.name}")
    println("Points ${user.points}")
    // Using let keyword
    User(name = "Subramanian", location = "Coimbatore", points = 100).let {
        //scope
        println("Location ${it.location}")
        println("Name${it.name}")
        println("Points ${it.points}")
        //return value
        it
    }.let {
        it.updateLocation("Chennai")
        it.incrementPoints()
        it
    }.let {
        println("Name${user.name}")
        println("Points ${user.points}")
    }
    "hello".let {
        it.uppercase()
        it
    }.let {
        println(it)
    }

    //using run method
    User(name = "Subramanian", location = "Coimbatore", points = 100).run {
        //scope
        println("Location ${this.location}")
        println("Name${this.name}")
        println("Points ${this.points}")
        //return value
        this
    }.run {
        this.updateLocation("Chennai")
        this.incrementPoints()
        this
    }.run {
        println("Name${this.name}")
        println("Points ${this.points}")
    }

    //using with method
    var myUser = User(name = "Subramanian", location = "Coimbatore", points = 100)

    println("With ")
    with(myUser.run {
        println("Location ${location}")
        println("Name${name}")
        println("Points ${points}")
        this
    }) {
        updateLocation("Chennai")
        incrementPoints()
        println("Name${name}")
        println("Points ${points}")
        this
    }
    with("subramanian".run {
        println("upper" + uppercase())
        trim()
        println(this)
        this
    }) {
        println("length " + this.length)
    }

    println("Apply function...")
    //apply
    User(name = "Subramanian", location = "Coimbatore", points = 100).apply {
        println(this.name + " " + name)
        println(location)
        println(points)
        name = "Murugan"
        updateLocation("US")
        incrementPoints()
        this
    }.apply {
        println(name)
        println(location)
        println(points)
    }
    //also
    println("also function...")
    User(name = "Subramanian", location = "Coimbatore", points = 100).also {
        println(it.name)
        println(it.location)
        //you dont need to return this manually : implicit this
    }.apply {
        println(name)
        println(location)
        println(points)
    }


}

