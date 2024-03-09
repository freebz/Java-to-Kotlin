// 예제 12.1 [operators.0:src/main/java/travelator/money/Money.kt]

class Money private constructor(
    val amount: BigDecimal,
    val currency: Currency
) {
    override fun equals(other: Any?): Boolean =
        this === other ||
                other is Money &&
                amount == other.amount &&
                currency == other.currency

    override fun hashCode() =
        Objects.hash(amount, currency)

    override fun toString(): String {
        return amount.toString() + " " + currency.getCurrencyCode()
    }

    fun add(that: Money): Money {
        require(currency == that.currency) {
            "cannot add Money values of different currencies"
        }
        return Money(amount.add(that.amount), currency)
    }

    companion object {
        @JvmStatic
        fun of(amount: BigDecimal, currency: Currency) = Money(
            amount.setScale(currency.defaultFractionDigits),
            currency
        )
        ... 오버로딩한 편의 함수
    }
}