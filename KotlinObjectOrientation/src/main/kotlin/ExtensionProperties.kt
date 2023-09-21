class MyUtil {

}

//Extension Properties
val MyUtil.greetings: String
    get() = "Hello"

val String.hello: String
    get() = "Hello"

fun main() {
    var myUtil = MyUtil()
    println(myUtil.greetings)
    var str:String = ""
    println(str.hello)
}