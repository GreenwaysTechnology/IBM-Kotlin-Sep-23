fun adder(action: (Int?, Int?) -> Unit) {
    action(10, 10)
    action(null, null)
    //action()

}

fun main() {
    adder(fun(a: Int?, b: Int?) {
        if (a != null && b !== null) {
            println(a + b)
        } else {
            println("Values are null ")
        }

    })
}