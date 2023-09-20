class OutterFoo {
    var myvar: Int? = 10

    inner class Bar {
        fun bar() = myvar
    }
}

fun main() {
    print(OutterFoo().Bar().bar())
}