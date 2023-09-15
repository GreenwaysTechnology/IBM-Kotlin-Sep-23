import kotlin.concurrent.thread

fun main() {
    println("dsl code")
    var mytask = { action: () -> Unit ->
        action()
    }
    mytask { println("DSL TASK") }

    var compute = { no: Int, action: () -> Unit ->
        println("$no")
        action()
    }

    fun filterBy(order: String = "asc", name: String = "name", no: Int = 0, action: () -> Unit) {
        println("Order ${order} name ${name} no ${no}")
        action()
    }

    //normal syntax
    compute(10, { println("hello") })
    //when pass lambda as second parameter or last last parameter, the first parameters can be
    //enclosed with in () and second parameter(lambda) can be passed directly
    compute(10) { println("computed") }

    //explicit values
    filterBy(order = "desc", name = "Subramanian", no = 100) { println("Hello") }
    //with default value
    filterBy { println("How are you") }
    //even though function is last you can pass even first parameter
    filterBy(action = { println("Hello") }, order = "desc", name = "Subramanian", no = 100)

    //SOme built in Kotlin functions are higher order functions with lambda
    thread(name = "My thread", start = true) {
        println("Current Thread ${Thread.currentThread().name}")
    }
    thread {
        println("Current Thread ${Thread.currentThread().name}")
    }
}