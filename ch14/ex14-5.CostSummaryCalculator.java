// 예제 14.5 [accumulator.0:src/main/java/travelator/itinerary/CostSummaryCalculator.java]

public class CostSummaryCalculator {
    private final Currency userCurrency;
    private final ExchangeRates exchangeRates;
    private final Map<Currency, Money> currencyTotals = new HashMap<>();

    public CostSummaryCalculator(
            Currency userCurrency,
            ExchangeRates exchangeRates
    ) {
        this.userCurrency = userCurrency;
        this.exchangeRates = exchangeRates;
    }

    public void addCost(Money cost) {
        currencyTotals.merge(cost.getCurrency(), cost, Money::add);
    }

    public CostSummary summarise() {
        var totals = new ArrayList<>(currencyTotals.values());
        totals.sort(comparing(m -> m.getCurrency().getCurrencyCode()));
        CostSummary summary = new CostSummary(userCurrency);
        for (var total : totals) {
            summary.addLine(exchangeRates.convert(total, userCurrency));
        }
        return summary;
    }

    public void reset() {
        currencyTotals.clear();
    }
}