// 예제 14.29 [accumulator.16:src/test/java/travelator/itinerary/Itinerary_CostTest.kt]

val fx: ExchangeRates = ...
val userCurrency = ...
val pricing = PricingContext(userCurrency, fx)

fun costSummary(i: Itinerary) = pricing.summarise(i.costs())