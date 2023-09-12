fun main() {
    //IF ELSE
    var a = 100
    var b = 10
    var max = a
    //traditional:java style
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("MAX $max")

    //Kotlin Expression style
    max = if (a > b) a else b
    println("MAX $max")

    var isValid = true

    var status = if (isValid) "Valid" else "Invalid"
    println("Status $status")

}