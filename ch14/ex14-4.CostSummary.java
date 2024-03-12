// 예제 14.4 [accumulator.0:src/main/java/travelator/itinerary/CostSummary.java]

public class CostSummary {
    private final List<CurrencyConversion> lines = new ArrayList<>();
    private Money total;

    public CostSummary(Currency userCurrency) {
        this.total = Money.of(0, userCurrency);
    }

    public void addLine(CurrencyConversion line) {
        lines.add(line);
        total = total.add(line.getToMoney());
    }

    public List<CurrencyConversion> getLines() {
        return List.copyOf(lines);
    }

    public Money getTotal() {
        return total;
    }
}