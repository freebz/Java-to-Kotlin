// 예제 14.9 [accumulator.3:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(): CostSummary {
    var totals = currencyTotals.values.sortedBy {
        it.currency.currencyCode
    }
    val summary = CostSummary(userCurrency).apply {
        for (total : totals) {
            addLine(exchangeRates.convert(total, userCurrency))
        }
    }
    return summary
}