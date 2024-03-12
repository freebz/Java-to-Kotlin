// 예제 14.11 [accumulator.5:src/main/java/travelator/itinerary/CostSummary.kt]

class CostSummary(userCurrency: Currency) {
    private val _lines = mutableListOf<CurrencyConversion<>()
    
    var total: Money = Money.of(0, userCurrency)
        private set

    val lines: List<CurrencyConversion>
        get() = _lines.toList()
    
    constructor(
        userCurrency: Currency,
        lines: List<CurrencyConversion>
    ): this(userCurrency) {
        lines.forEach(::addLine)
    }

    fun addLine(line: CurrencyConversion) {
        _lines.add(line)
        total += line.toMoney
    }
}