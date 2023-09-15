fun main() {
    var login = { userName: String,
                  password: String,
                  resolve: (String) -> String,
                  reject: (String) -> String ->
        if (userName === "admin" && password === "admin")
            resolve("Login success")
        else
            reject("login failed")
    }
    //invoke lambda
    login(userName = "admin",
        password = "admin",
        { status -> println(status) },
        { err -> println(err) }
    )

}