open class Animal {
    open var category: String? = "Animal"
    open fun eat(): String {
        return "Animal eats"
    }
}

class Dog : Animal() {
    override var category: String? = "Dog"
    override fun eat(): String {
        return "Dog eats"
    }

    fun bark(): String {
        return "Dog barks"
    }
}

fun main() {
    //Program to Concretype
    var dog: Dog = Dog()
    println(dog.eat())

    //Program to Super type
    var dog1: Animal = Dog()
    println(dog1.eat())
    //dog1.bark()
    //here we convert dog1 type(Animal) to Dog type
    var dog2: Dog = dog1 as Dog
    println(dog2.bark())

    println(dog1.category)

}