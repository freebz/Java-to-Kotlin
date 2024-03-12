// 예제 14.21 [accumulator.9:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

class CostSummaryCalculator(
    private val userCurrency: Currency,
    private val exchangeRates: ExchangeRates
) {
    private val currencyTotals = mutableMapOf<Currency, Money>()

    fun addCost(cost: Money) {
        currencyTotals.merge(cost.currency, cost, Money::add)
    }

    fun summarise(): CostSummary {
        var lines = currencyTotals.values
            .sortedBy { it.currency.currencyCode }
            .map { exchangeRates.convert(it, userCurrency) }
    
        val total = lines
            .map { it.toMoney }
            .fold(Money.of(0, userCurrency), Money::add)
    
        return CostSummary(lines, total)
    }
    
    fun reset() {
        currencyTotals.clear()
    }
}