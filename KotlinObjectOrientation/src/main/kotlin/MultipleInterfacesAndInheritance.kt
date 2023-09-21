interface Eat {
    fun eat(): String
}

interface Walk {
    fun walk(): String
}

interface Hunt {
    fun hunt(): String
}

class Tiger : Eat, Walk, Hunt {
    override fun eat(): String {
        return "eat"
    }

    override fun hunt(): String {
        return "hunt"

    }

    override fun walk(): String {
        return "walk"

    }
}

fun main() {
    var tiger = Tiger()
    println(tiger.eat())
    println(tiger.walk())
    println(tiger.hunt())

}