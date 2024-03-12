// 예제 14.13 [accumulator.6:src/main/java/travelator/itinerary/CostSummary.kt]

class CostSummary(
    userCurrency: Currency,
    val lines: List<CurrencyConversion>
) {
    var total: Money = Money.of(0, userCurrency)
        private set

    init {
        lines.forEach {
            total += it.toMoney
        }
    }
}