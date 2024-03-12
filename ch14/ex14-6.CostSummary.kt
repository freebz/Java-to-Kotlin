// 예제 14.6 [accumulator.1:src/main/java/travelator/itinerary/CostSummary.kt]

class CostSummary(userCurrency: Currency) {
    private val _lines = mutableListOf<CurrencyConversion<>()
    
    var total: Money = Money.of(0, userCurrency)
        private set

    val lines: List<CurrencyConversion>
        get() = _lines.toList()
    
    fun addLine(line: CurrencyConversion) {
        _lines.add(line)
        total += line.toMoney
    }
}