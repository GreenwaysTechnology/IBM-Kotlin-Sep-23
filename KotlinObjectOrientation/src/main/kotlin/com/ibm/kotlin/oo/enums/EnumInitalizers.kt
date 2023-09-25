package com.ibm.kotlin.oo.enums

enum class Day(val day: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    //methods
    fun getDayOfWeek(): String {
        return "[${SUNDAY}] IS Holiday"
    }
}


fun main() {
    println("Value ${Day.MONDAY.day} ${Day.MONDAY.name}")
    println("${Day.SUNDAY.getDayOfWeek()}")
}