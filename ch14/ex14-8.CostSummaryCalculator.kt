// 예제 14.8 [accumulator.2:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(): CostSummary {
    var totals = currencyTotals.values.sortedBy {
        it.currency.currencyCode
    }
    val summary = CostSummary(userCurrency)
    for (var total : totals) {
        summary.addLine(exchangeRates.convert(total, userCurrency))
    }
    return summary
}