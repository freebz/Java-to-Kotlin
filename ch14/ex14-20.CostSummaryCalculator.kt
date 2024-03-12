// 예제 14.20 [accumulator.9:src/main/java/travelator/itinerary/CostSummaryCalculator.kt]

val total = lines
    .map { it.toMoney }
    .fold(Money.of(0, userCurrency), Money::add)