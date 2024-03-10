// 예제 13.12 [streams-to-sequences.7:src/main/java/travelator/analytics/MarketingAnalytics.kt]

private fun <T: MutableList<MutableMap<String, Any>>> averageBy(
  values: Collection<T>,
  selector: (T) -> Int
): Double {
  return values.sumBy(selector) / values.size.toDouble()
}