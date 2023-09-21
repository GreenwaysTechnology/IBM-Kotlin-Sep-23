interface Interface1 {
    fun doStuff(): String

    //implementation methods
    fun foo() {
        println("interface 1")
    }
}

interface Interface2 {
    fun doStuff(): String

    //implementation methods
    fun foo() {
        println("interface 2")
    }
}

class Implementor : Interface1, Interface2 {
    override fun doStuff(): String {
        return "DoStuff"
    }

    override fun foo() {
        super<Interface2>.foo()
    }
}

fun main() {
    var implementor = Implementor()
    println(implementor.doStuff())
    implementor.foo()
}