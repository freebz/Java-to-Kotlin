// 예제 12.4 [operators.4:src/main/java/travelator/money/Money.kt]

@JvmName("add")
operator fun plus(that: Money): Money {
    require(currency == that.currency) {
        "cannot add Money values of different currencies"
    }
    return Money(amount.add(that.amount), currency)
}