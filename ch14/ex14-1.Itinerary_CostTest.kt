// 예제 14.1 [accumulator.0:src/test/java/travelator/itinerary/Itinerary_CostTest.kt]

val fx: ExchangeRates = ...
val userCurrency = ...
val calculator = CostSummaryCalculator(userCurrency, fx)

fun costSummary(i: Itinerary): CostSummary {
    i.addCostsTo(calculator)
    return calculator.summarise()
}