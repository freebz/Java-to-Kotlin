// 예제 12.8 [operators.9:src/main/java/travelator/money/Money.kt]

fun add(that: Money) = this + that

operator fun plus(that: Money): Money {
    require(currency == that.currency) {
        "cannot add Money values of different currencies"
    }
    return Money(amount.add(that.amount), currency)
}