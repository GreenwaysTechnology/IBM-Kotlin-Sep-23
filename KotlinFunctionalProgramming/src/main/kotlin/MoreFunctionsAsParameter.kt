fun login(
    userName: String? = "admin",
    password: String? = "admin",
    resolve: ((String?) -> Unit?)? = fun(status) {
        println(status)
    },
    reject: ((String?) -> Unit?)? = fun(err) {
        println(err)
    }
) {

    if (userName === "admin" && password == "admin")
        if (resolve != null) {
            resolve("Login Success")
        }
    else
        if (reject != null) {
            reject("Login Failed")
        }

}

fun main() {
    login(
        userName = "admin",
        password = "admin",
        fun(status) {
            println(status)
        },
        fun(err) {
            println(err)
        }
    )

    login(
        userName = "foo",
        password = "bar",
        fun(status) {
            println(status)
        },
        fun(err) {
            println(err)
        }
    )
    login()
    login(null,null,null,null)
}