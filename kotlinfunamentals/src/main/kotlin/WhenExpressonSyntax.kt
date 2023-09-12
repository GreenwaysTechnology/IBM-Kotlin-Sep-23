fun main() {

    //Expression based
    var isLoggedIn = false
    var status = when (isLoggedIn) {
        true -> "Logged In"
        false -> "Not Logged In"
    }
    println("Status $status")
    var x = 1
    when (x) {
        1 -> println("X is 1")
        2 -> println("X is two")
        10 -> println("X is 10")
    }

}
