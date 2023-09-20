class GuestUser {
    var firstName: String? = null
    var lastName: String? = null
    var fullName: String? = null
        //computed property
        get() {
            return "${this.firstName} ${this.lastName}"
        }
}

fun main() {
    var user = GuestUser()
    user.firstName = "Subramanian"
    user.lastName = "Murugan"
    println(user.fullName)
}