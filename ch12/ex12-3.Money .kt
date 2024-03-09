// 예제 12.3 [operators.3:src/main/java/travelator/money/Money.kt]

@JvmName("add")
fun add(that: Money): Money {
    require(currency == that.currency) {
        "cannot add Money values of different currencies"
    }
    return Money(amount.add(that.amount), currency)
}