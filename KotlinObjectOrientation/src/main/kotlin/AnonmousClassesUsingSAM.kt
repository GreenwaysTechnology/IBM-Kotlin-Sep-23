//this interface having only one abstract methods
fun interface Greeter {
    //abstract fun greet(): Unit
    //by default all methods within interface is abstract, no need of using abstract keyword.
    fun greet(): Unit
}

fun interface Hello {
    fun sayHello(): Unit
}

//how to implement interface
//way 1 : using class implementation
class GreeterImpl : Greeter {
    override fun greet() {
        println("Greet")
    }
}


fun main() {
    var greeter = GreeterImpl()
    greeter.greet()
    //way 2 : anonymous inner class syntax: without class implementation .
    var mygreet = object : Greeter {
        override fun greet() {
            println("Anonymous Inner class")
        }
    }
    mygreet.greet()
    var mygreet1 = Greeter {
        println("Anonymous Inner class")
    }
    mygreet1.greet()
    //Refactored Code Lambda Expression syntax: but the interface must be marked with fun keyword
    var hello = Hello {
        println("Hello Lambda version")
    }
    hello.sayHello()
    //short cut
    Hello {
        println("Hello simplified lambda")
    }.sayHello()


}