//function that accepts lambda as parameter
//no args and no return
fun greeter(action: () -> Unit) {
    action()
}

fun hello(action: (String) -> Unit) {
    action("Hello!!!")
}

fun hai(action: (String) -> String) {
    var res = action("Hai, How are you?")
    println(res)
}

fun main() {
    greeter({ println("hello") })
    greeter({
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        println("hello")
    })
    //lambda tha takes args
    hello({ message: String ->
        println(message)
    })
    hai({ message ->
        message
    })
}