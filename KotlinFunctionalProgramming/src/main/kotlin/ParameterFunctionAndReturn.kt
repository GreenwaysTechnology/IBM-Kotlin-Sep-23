fun connect(action: (status: Boolean) -> String) {
    var result = action(true)
    println(result)
}

fun main() {
    connect(fun(status: Boolean): String {
        println(status)
        return "Connected";
    })
}