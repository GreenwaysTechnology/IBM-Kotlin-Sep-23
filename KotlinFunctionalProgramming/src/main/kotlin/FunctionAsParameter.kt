fun add(a: Int, b: Int): Int {
    return a + b
}


//Higher order function:
fun sayGreet(action: () -> Unit) {
    action()
}

fun main() {
    //passing hard coded value
    println(add(10, 10))
    var x = 10
    var y = 20
    //passing variables
    println(add(x, y))

    var greet: () -> Unit = fun() {
        println("Greet")
    }
    sayGreet(greet)
    //passing anonmous function as parameter directly
    sayGreet(fun() {
        println("Greet anonymous")
    })

}