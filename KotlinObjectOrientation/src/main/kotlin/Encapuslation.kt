private var foo: Int = 10

//public var bar: String = "20"
//public by default
var bar: String = "20"
internal var b: String = "223"


//functions with access modifer
//fun myFun() {
//    println("public fun")
//}
//Global Functions
public fun myFun() {
    println("public fun")
}

private fun getPassword() {
    println("Password ")
}

//Specific to Module
internal fun myInternal() {
    println("Global function")
}

//classes
//public class MyDemoClass {
//
//}

//Global Class
class MyDemoClass {

}

//private class is allowed, it is part of another internal kotlin class: so it is considered as
//inner class
private class MyDemoClassOne {

}

//Specific to module
internal class MyInternalClass {

}

//Modifier 'protected' is not applicable to 'top level property without backing field or delegate'
//protected var a:Int =10
fun main() {
    println(foo)
    println(bar)
    println(b)
    myFun()
    getPassword()
    myInternal()
    MyDemoClassOne()
}