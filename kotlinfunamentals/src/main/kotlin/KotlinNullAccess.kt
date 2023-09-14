fun main() {
    var message: String? = null
    //println(message.length)
//    message="hello"
    //way 1: java style
    if (message != null) {
        println("Message Size is ${message.length}")
    } else {
        println("Message Size is having null value")
    }
    //Way 2: Kotlin Style : Using SafeNavgiation Operator
    println("Message Size Using Safe Navigation Operator ${message?.length}")

    //Way 3:Kotlin Style: Using Elvis Operator
    var length = message?.length ?: 0
    println("Message Size Using Elvis Operator ${length}")

    //Way 4: Kotlin Style:Using Not Null Assertion Operator(!!)
    println("Message Size using Not Null Assertion Operator ${message!!.length}")

}