fun main() {
    //Lambda accepts another lamabda as parameter
    var greet = { action: () -> Unit ->
        action()
    }
    greet {
        println("Lambda")
    }
    //Lambda accepts another lamabd as parameter which pass some value to the caller lambda
    var add = { action: (Int, Int) -> Int ->
        println(action(10, 10))
    }
    add { a: Int, b: Int -> a + b }
}