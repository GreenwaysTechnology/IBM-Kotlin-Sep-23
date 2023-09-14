fun main() {

    var display: (String?) -> String? = fun(message: String?): String? {
        return message ?: "Default"
    }
    println(display?.invoke("Hello"))
    println(display?.invoke(null))

    var showMyName: (String?, String?) -> String? = fun(name: String?, message: String?): String? {
        return "$message $name"
    }
    println(showMyName?.invoke("Subramanian", "Hello"))
    println(showMyName?.invoke(null, null))

    //Type inference simplifies the function types
    var show = fun(name: String?, message: String?): String? {
        return "$message $name"
    }
    println(show?.invoke("Subramanian", "Hello"))
    println(show?.invoke(null, null))

}
