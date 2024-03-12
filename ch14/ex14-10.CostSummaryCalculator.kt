// 예제 14.10 [accumulator.4:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(): CostSummary {
    var conversions = currencyTotals.values.sortedBy {
        it.currency.currencyCode
    }.map { exchangeRates.convert(it, userCurrency) }

    return CostSummary(userCurrency).apply {
        conversions.forEach(this::addLine)
    }
}