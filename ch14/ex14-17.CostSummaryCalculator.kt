// 예제 14.17 [accumulator.9:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(): CostSummary {
    var lines = currencyTotals.values
        .sortedBy { it.currency.currencyCode }
        .map { exchangeRates.convert(it, userCurrency) }

    val total = lines
        .map { it.toMoney }
        .fold(Money.of(0, userCurrency), Money::add)

    return CostSummary(lines, total)
}