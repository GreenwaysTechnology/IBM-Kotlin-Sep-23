/**
 * Normal function
fun sum(a: Int = 0, b: Int = 0): Int {
return a * b
}
 **/
//Single Expression Function
//Here we can omit curly braces and return statement.
fun sum(a: Int = 0, b: Int = 0): Int = a * b
fun getStock(value: Double): Double = value

//Here even we can omit return Type: Type Inference is enabled
fun double(x: Int) = x * 2
fun main() {
    println(sum(a = 90, b = 89))
    println(getStock(value = 10.89))
    println(double(x = 10))
}