class Utility {
    //member function
    fun sayHello(): String {
        return "MemberFunction"
    }
}

//Extensions
fun Utility.sayHai(): String {
    println(this)
    return "Extension Function"
}

//Extensions with String object
//fun String.concat(): String {
//    return "concat";
//}
// ReceiverType.function; String
fun String.concat(s1: String): String {
    //How to refer receiver Type(Object) and its properties?
    //there is keyword called this keyword - this keyword is used to refer "Receiver" Object
    return "$s1 $this"
}

    fun Int.add(another: Int): Int {
        return this.plus(another)
    }

    fun Int.multiply(another: Int): Int {
        return this * another
    }


fun main() {
    var utility = Utility()
    println(utility.sayHello())
    println(utility.sayHai())
//    var message: String = "hello"
//    println(message.concat())

    var str1 = "Hello"
    var str2 = "Subramanian";
    println(str2.concat(str1)) //Hello Subramaian

    var one = 10
    var two = 2
    var res = one.plus(two)
    println(res)
    println(one.add(two))
    println(one.multiply(two))


}