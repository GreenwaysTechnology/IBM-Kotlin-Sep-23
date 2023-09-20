class Utility {
    //member function
    fun sayHello(): String {
        return "MemberFunction"
    }
}

//Extensions
fun Utility.sayHai(): String {
    return "Extension Function"
}

//Extensions with String object
fun String.concat(): String {
    return "concat";
}


fun main() {
    var utility = Utility()
    println(utility.sayHello())
    println(utility.sayHai())
    var message: String = "hello"
    println(message.concat())
}