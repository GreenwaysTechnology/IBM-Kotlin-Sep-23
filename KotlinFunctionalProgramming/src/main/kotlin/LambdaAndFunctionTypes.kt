//normal function
fun myadd(a: Int = 1, b: Int = 1): Int {
    return a + b
}

//single function expression
fun addExpression(a: Int = 1, b: Int = 1) = a + b

//function literal
var addFun = fun(a: Int, b: Int): Int {
    return a + b
}
//var addLambda: (Int, Int) -> Int = { a: Int, b: Int ->
//    //return
//    a + b
//}
var addLambda = { a: Int, b: Int ->
    //return
    a + b
}
fun main() {
    println(myadd(10, 10))
    println(addExpression())
    println(addFun(1, 3))
    println(addLambda(10, 10))
}