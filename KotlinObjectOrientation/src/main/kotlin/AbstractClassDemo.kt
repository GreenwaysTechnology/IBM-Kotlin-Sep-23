import kotlin.math.cbrt

abstract class Bird {
    //abstract method
    abstract fun fly(): Unit

    //non abstract method
    fun saveBirds() {
        println("Save Birds from hunters and Global warming")
    }
}

//
class Sparrow : Bird() {
    override fun fly() {
        println("Sparrow flys")
    }
}

class Eagle : Bird() {
    override fun fly() {
        println("Eagle flys at high")
    }
}


fun main() {
    var bird: Bird = Sparrow()
    bird.fly()
    bird.saveBirds()
    bird = Eagle()
    bird.fly()
    bird.saveBirds()
}