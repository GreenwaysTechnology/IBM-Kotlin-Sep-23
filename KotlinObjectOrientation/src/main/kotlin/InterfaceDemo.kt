interface Eatable {
    fun eat(): String
}

class Cat : Eatable {
    override fun eat(): String {
        return "Cat eats"
    }

    fun hunt() = "Hunt"
}

class Duck : Eatable {
    override fun eat(): String {
        return "Duck Eats"
    }

    fun swim() = "Swim"
}

fun main() {
    var myvar: Eatable? = null
    myvar = Cat()
    println(myvar.eat())
    //smart casting happens
    println(myvar.hunt())
    myvar = Duck()
    println(myvar.eat())
//    var myvar2 = myvar as Duck
//    println(myvar2.swim())

    //smart casting happens
    println(myvar.swim())

}