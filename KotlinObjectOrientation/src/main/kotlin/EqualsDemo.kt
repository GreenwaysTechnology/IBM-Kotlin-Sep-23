class Square(val side: Int) {

    override fun equals(other: Any?): Boolean {
        //Test whether other variables is same as Square type: in java we use "instanceOf"
        //operator : in Kotlin we use "is" operator
        if (other is Square) {
            return other.side == side
        }
        return false
    }

    override fun hashCode(): Int {
        return 23232323
    }
}

fun main() {
    var square1 = Square(10)
    var square2 = Square(10)
    var square3 = square2 // square3 and square2 points the same object

    //using equals method
    var isEqual = square1.equals(square2)
    var res = if (isEqual) "Two Squares are equal" else "two squares are not equal"
    println(res)
    //using equals operator :Compares based on property
    isEqual = square1 == square2
    res = if (isEqual) "Two Squares are equal" else "two squares are not equal"
    println(res)

    //using triple equals operator compares based on memory location
    isEqual = square3 === square2
    res = if (isEqual) "Two Squares are equal" else "two squares are not equal"
    println(res)

    println(square1.hashCode())
}