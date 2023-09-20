//class MyClass constructor() {
//    //Secondary constructors
//    constructor(a: String) : this() {
//        println("Constructor with String arg ${a}")
//    }
//
//    constructor(b: Int) : this() {
//        println("Constructor with Int arg ${b}")
//    }
//
//    constructor(c: Boolean) : this() {
//        println("Constructor with Boolean arg ${c}")
//    }
//}
//class MyClass() {
//    //Secondary constructors
//    constructor(a: String) : this() {
//        println("Constructor with String arg ${a}")
//    }
//
//    constructor(b: Int) : this() {
//        println("Constructor with Int arg ${b}")
//    }
//
//    constructor(c: Boolean) : this() {
//        println("Constructor with Boolean arg ${c}")
//    }
//}

//without primary constructors , only having secondary constructors: java style
class MyClass {
    //Secondary constructors
    constructor(a: String) {
        println("Constructor with String arg ${a}")
    }

    constructor(b: Int) {
        println("Constructor with Int arg ${b}")
    }

    constructor(c: Boolean) {
        println("Constructor with Boolean arg ${c}")
    }
}

fun main() {
    var myclass = MyClass("subramanian")
    myclass = MyClass(100)
    myclass = MyClass(true)
}