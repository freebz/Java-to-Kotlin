// 예제 12.2 [operators.2:src/main/java/travelator/money/Money.kt]

class Money private constructor(
    val amount: BigDecimal,
    val currency: Currency
) {
    ...
    operator fun plus(that: Money): Money {
        require(currency == that.currency) {
            "cannot add Money values of different currencies"
        }
        return Money(amount.add(that.amount), currency)
    }
    ...
}