package com.ibm.kotlin.oo.operatoroverloading

class Person {
    var skills: String? = null
    fun show() = skills
}

operator infix fun Person.plus(person: Person): Person {
    var newPerson = Person()
    newPerson.skills = this.skills + person.skills
    return newPerson
}


fun main() {
    var person1 = Person()
    person1.skills = "Kotlin"
    println(person1.show())
    var person2 = Person()
    person2.skills = "Mobile Developement"
    println(person2.show())

    //Coimbine two person skills via operator
    //var newSkill = person1.plus(person2)
//    var newSkill = person1 + person2
    var newSkill = person1 plus person2
    newSkill.apply {
        println(show())
    }
    //Builtin operator over loaded apis
    var a: Int = 100
    var b: Int = 200
    //without operator overloading
    var c: Int? = null
    c = a + b
    println(c)
    //with operator overloading
    c = a.plus(b)
    println(c)

}