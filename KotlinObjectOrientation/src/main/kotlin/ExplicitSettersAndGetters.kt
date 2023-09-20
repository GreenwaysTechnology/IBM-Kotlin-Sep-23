class User {
    var name: String? = null
        //setter
        set(value) {
            //backing field
            field = "Mr / Mrs $value"
        }
        //getter
        get() {
            return field?.uppercase()
        }
}


fun main() {
    var user = User();
    user.name = "subramanian"
    println(user.name)

}