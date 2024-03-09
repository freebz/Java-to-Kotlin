// 예제 12.13 [operators.16:src/main/java/travelator/money/ExchangeRates.kt]

interface ExchangeRates {
    fun rate(fromCurrency: Currency, toCurrency: Currency): BigDecimal
    @JvmDefault
    fun convert(fromMoney: Money, toCurrency: Currency): CurrencyConversion {
        val rate = rate(fromMoney.currency, toCurrency)
        val toAmount = fromMoney.amount * rate
        val toMoney = Money.of(toAmount, toCurrency)
        return CurrencyConversion(fromMoney, toMoney)
    }
}