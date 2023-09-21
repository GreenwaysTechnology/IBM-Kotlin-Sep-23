class MyInfix {
    infix fun sayHello(name: String): Unit {
        println(name.uppercase())
    }
}

//extension function
infix fun MyInfix.sayHai(name: String) {
    println(name.uppercase())
}

infix fun Int.myAdd(another: Int) {
    println(this.add(another))
}

fun main() {
    var myInfix = MyInfix()
    //regular call
    myInfix.sayHello("Hello")
    //infix syntax
    myInfix sayHello "Hello"
    myInfix sayHai "subramanian"
    10 myAdd 100
}