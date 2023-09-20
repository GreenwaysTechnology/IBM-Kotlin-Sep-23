class MyUser {
    var name: String? = null
        set(value) {
            field = "Mr/Mrs $value"
        }
        //normal method syntax
//       get() {
//           return field?.uppercase();
//       }
        get() = field?.uppercase()
}

fun main() {
    val user = MyUser()
    user.name = "Subramanian"
    println("Name ${user.name}")
}