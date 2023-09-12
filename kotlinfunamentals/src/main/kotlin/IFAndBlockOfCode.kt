fun main() {
    var isEnabled = false
    var res = if (isEnabled) "Enabled" else "Disabled"
    println("Result is $res")

    //block of code
    res = if (isEnabled) {
        println("Some code")
        println("some even if more code")
        //must return value
        "Enabled"
    } else {
        println("some else code")
        println("some even extra else code")
        "Disabled"
    }
    println("Result is $res")
}