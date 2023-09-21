fun sayGreet() {
    var counter = 1..100
    for (count in counter) {
        //sayHello(count)
        println(isEven(count))
    }
}

inline fun isEven(no: Int): Boolean {
    return no % 2 == 0
}

inline fun sayHello(count: Int) {
    println("Hello $count")
}


fun main() {
    sayGreet()
}