fun main() {
    //simple range
    for (i in 1..10) {
        print(i)
    }
    println("\n")
    //Reverse order
    for (j in 10 downTo  1) {
        print(j)
    }
    //increment by 2
    for(counter in 1..100 step 2) println(counter)

    //until
    for(counter in 5 until 10) println(counter)
}