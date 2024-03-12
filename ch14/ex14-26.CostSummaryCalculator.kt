// 예제 14.26 [accumulator.13:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(costs: Iterable<Money>): CostSummary {
    val currencyTotals = mutableMapOf<Currency, Money>()
    costs.forEach {
        currencyTotals.merge(it.currency, it, Money::plus)
    }
    val lines = currencyTotals.values
        .sortedBy { it.currency.currencyCode }
        .map { exchangeRates.convert(it, userCurrency) }
    val total = lines
        .map { it.toMoney }
        .fold(Money(0, userCurrency), Money::add)
    return CostSummary(lines, total)
}