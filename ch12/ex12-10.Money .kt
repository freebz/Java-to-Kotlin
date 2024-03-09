// 예제 12.10 [operators.12:src/main/java/travelator/money/Money.kt]

class Money private constructor(
    val amount: BigDecimal,
    val currency: Currency
) {
    ...
    
    companion object {
        @JvmStatic
        fun of(amount: BigDecimal, currency: Currency) =
            invoke(amount, currency)
        
        private fun invoke(amount: BigDecimal, currency: Currency) =
            Money(
                amount.setScale(currency.defaultFractionDigits),
                currency
            )
        ... 오버로딩한 편의 함수
    }
}