fun main() {
    //What if the paremeter is nullable
    var accept: ((String) -> String)? = fun(message: String): String {
        return message;
    }
//    println(accept("Hello"))
//    println(accept(null))
    //Pattern 1: "Surround with Null Check"
    if (accept != null) {
        println(accept("Hello"))
    }
    println(accept?.invoke("Hell Invoke"))

}