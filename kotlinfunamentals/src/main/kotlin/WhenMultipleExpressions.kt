fun main() {
    var y = 100
    when (y) {
        0, 1, 2, 3, 4, 5, 6, 7 -> println("0 to 7 met")
        8, 9, 10 -> println("8 to 10 met")
        else -> println("No Match Found")
    }
}