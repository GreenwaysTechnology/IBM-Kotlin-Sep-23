class Util {
    //normal function
    fun sayHai(): Unit {
        println("Hai")
    }

    //literal declaration
    var sayHello: () -> Unit = fun() {
        println("Hello")
    }

    //lambda version
    var add = { a: Int, b: Int ->
        a + b
    }

    //higher order function
    fun login(userName: String = "", password: String = "", resolve: (String) -> Unit, reject: (String) -> Unit) {
        if (userName == "admin" && password == "admin") {
            resolve("login success")
        } else {
            reject("login failed")
        }
    }

    //higher order lambda
    fun delay(action: () -> Unit) {
        action()
    }

    var async = { action: (String) -> Unit ->
        action("async function")
    }
}


fun main() {
    var util = Util()
    util.sayHello()
    util.sayHai()
    println(util.add(10, 10))
    util.login(userName = "admin",
        password = "admin",
        fun(status) {
            println(status)
        },
        fun(err) {
            println(err)
        }
    )
    util.delay { println("delay") }
    util.async { println(it) }
}