//class Person constructor(
//    var firstName: String? = "",
//    var lastName: String? = "",
//    var age: Int? = 1
//) {
//
//}
//without constructor keyword
//class Person(
//    var firstName: String? = "",
//    var lastName: String? = "",
//    var age: Int? = 1
//) {
//
//}
//constructors with init block
class Person(
    var firstName: String? = "",
    var lastName: String? = "",
    var age: Int? =0
) {
    init {
        age = 18
    }
}

fun main() {
    //pass constructor parameters
    //default constructor
    var person = Person();
    println("firstName ${person.firstName} lastName ${person.lastName} ${person.age}")
    //all arg constructor
    person = Person(firstName = "Subramanian", lastName = "Murugan", age = 43)
    println("firstName ${person.firstName} lastName ${person.lastName} ${person.age}")
    //two arg
    person = Person(firstName = "Subramanian", age = 43)
    println("firstName ${person.firstName} lastName ${person.lastName} ${person.age}")
    //single arg
    person = Person(age = 43)
    println("firstName ${person.firstName} lastName ${person.lastName} ${person.age}")
}