fun main() {
    var num = 3
    var isEvenOrOdd = when {
        num % 2 == 0 -> "Even"
        num % 2 != 0 -> "Odd"
        else -> "No Match Found"
    }
    println("Result is $isEvenOrOdd")
}