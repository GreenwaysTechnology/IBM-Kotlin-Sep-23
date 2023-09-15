var loginLambda = { userName: String, password: String ->
    if (userName == "admin" && password == "admin") "Login Success" else "Login failed"
}

fun main() {
    println(loginLambda("admin", "admin"))
}