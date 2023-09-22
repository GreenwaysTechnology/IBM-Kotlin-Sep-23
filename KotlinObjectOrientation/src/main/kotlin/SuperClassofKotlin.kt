class Money {
    var curreny: String? = "INR"

    override fun toString(): String {
        return "Currency [$curreny]"
    }
}

fun main() {
    var money = Money()
    println(money.toString())
}