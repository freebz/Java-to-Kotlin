// 예제 12.9 [operators.11:src/main/java/travelator/money/Money.kt]

operator fun plus(that: Money): Money {
    require(currency == that.currency) {
        "cannot add Money values of different currencies"
    }
    return Money(this.amount + that.amount, currency)
}