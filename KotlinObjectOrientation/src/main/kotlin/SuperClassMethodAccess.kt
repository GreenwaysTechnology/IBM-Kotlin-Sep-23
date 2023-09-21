open class Account {
    open fun deposit(): Int {
        return 100
    }

    val accountType: String get() = "Account Type"
}

class SavingsAccount : Account() {
    override fun deposit(): Int {
        return super.deposit().plus(1000)
    }

    val accType: String get() = "${super.accountType} is Savings Account"

}

fun main() {
    var sb: Account = SavingsAccount()
    var sb1 = sb as SavingsAccount
    println("${sb.deposit()} ${sb1.accType}")
}