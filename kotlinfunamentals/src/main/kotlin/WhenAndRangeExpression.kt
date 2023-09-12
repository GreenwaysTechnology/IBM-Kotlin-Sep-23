fun main() {
    var x = 600
    when (x) {
        in 1..100 -> println("X falls in range of 1 to 100")
        in 101..1000 -> println("X falls in range of 101 to 1000")
        else -> {
            println("X does not fall under the range")
        }
    }
}