package com.ibm.kotlin.oo.enums

//Enum declartions
enum class Color {
    //RED=0,BLUE=1,GREEN=2
    RED, BLUE, GREEN
}
enum class Positions {
    NORTH,EAST,WEST,SOUTH
}

fun main() {
  println("Value ${Color.RED.ordinal} Name ${Color.RED.name}")

}