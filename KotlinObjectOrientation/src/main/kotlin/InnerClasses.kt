//class outer
class Outer {
    constructor() {
        println("Outter class constructor")
    }

    class Inner {
        constructor() {
            println("Inner class constructor")
        }

        fun doStuff() {
            println("Inner doStuff")
        }
    }

    fun createInner() {
        var inner = Inner()
        inner.doStuff()
    }
}


fun main() {
    var outter = Outer()
    outter.createInner()

    //access inner classes via outter class
    var outertwo = Outer.Inner()
    outertwo.doStuff()

    //calling methods directly using outer and inner instance
    Outer.Inner().doStuff()
}