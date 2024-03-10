// 예제 13.11 [streams-to-sequences.6:src/main/java/travelator/analytics/MarketingAnalytics.kt]

private fun averageBy(
  values: Collection<MutableList<MutableMap<String, Any>>>,
  selector: (MutableList<MutableMap<String, Any>>) -> Int
): Double {
  return values.sumBy(selector) / values.size.toDouble()
}