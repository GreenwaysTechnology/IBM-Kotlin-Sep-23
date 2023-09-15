fun doCompute(a: Int = 10, b: Int = 10, action: (Int, Int) -> Unit) {
    action(a, b)
}

fun main() {
    doCompute { _, b -> println("$b") }
    doCompute(b = 90) { _, b -> println("$b") }

}