// 예제 14.23 [accumulator.12:src/test/java/travelator/itinerary/Itinerary_CostTest.kt]

val fx: ExchangeRates = ...
val userCurrency = ...
val calculator = CostSummaryCalculator(userCurrency, fx)

fun costSummary(i: Itinerary) =
    calculator.summarise(i.costs())