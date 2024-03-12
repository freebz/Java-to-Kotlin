// 예제 14.22 [accumulator.11:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

fun summarise(costs: Iterable<Money>): CostSummary {
    val delegate = CostSummaryCalculator(userCurrency, exchangeRates)
    costs.forEach(delegate::addCost)
    return delegate.summarise()
}