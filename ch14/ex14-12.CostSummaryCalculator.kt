// 예제 14.12 [accumulator.5:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(): CostSummary {
    var conversions = currencyTotals.values.sortedBy {
        it.currency.currencyCode
    }.map { exchangeRates.convert(it, userCurrency) }

    return CostSummary(userCurrency, conversions)
}