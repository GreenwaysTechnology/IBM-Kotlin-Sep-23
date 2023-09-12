fun main() {
    var a = 100
    var b = 20
    var max = a
    //Traditional way
    if (a < b) {
        max = b
    }
    println("Max $max")
    //Kotlin Expression Style
    if (a < b) max = b // Here we return max variable : looks like function return value
    println("Max $max")

}