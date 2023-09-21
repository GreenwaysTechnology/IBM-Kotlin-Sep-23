open class Base {
    init {
        println("Base init is called")
    }
}

class Child : Base() {
    init {
        println("Child init is called")
    }
}


fun main() {
    var child = Child()
}