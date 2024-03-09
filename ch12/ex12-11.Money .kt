// 예제 12.11 [operators.13:src/main/java/travelator/money/Money.kt]

@JvmStatic
fun of(amount: BigDecimal, currency: Currency) =
    invoke(amount, currency)

operator fun invoke(amount: BigDecimal, currency: Currency) =
    Money(
        amount.setScale(currency.defaultFractionDigits),
        currency
    )