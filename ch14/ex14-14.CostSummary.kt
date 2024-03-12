// 예제 14.14 [accumulator.7:src/main/java/travelator/itinerary/CostSummary.kt]

class CostSummary(
    userCurrency: Currency,
    val lines: List<CurrencyConversion>
) {
    val total = lines
        .map { it.toMoney }
        .fold(Money.of(0, userCurrency), Money::add)
}