fun calculate(a: Int = 0, b: Int = 0): Int {
    return a + b
}

fun sayMyName(name: String = "Default Name"): String {
    return name
}

fun main() {
    var res = calculate(b = 10, a = 30)
    println("Calcualte Result $res")
    var name = sayMyName(name = "Subramanian")
    println("Name $name")
}