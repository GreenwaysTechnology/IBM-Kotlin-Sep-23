fun main() {
    var a = 100
    var b = 2
    var maxLimit = 1
    var maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b
    println("maxorMaxLimit is $maxOrLimit")
}