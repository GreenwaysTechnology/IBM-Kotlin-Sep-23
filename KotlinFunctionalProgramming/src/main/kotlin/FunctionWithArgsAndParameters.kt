fun main() {
    //fun with args and parameters
    var add: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(add(10, 10))

    var substract = fun(a: Int, b: Int): Int {
        return a - b
    }
    println(substract(10, 8))
}