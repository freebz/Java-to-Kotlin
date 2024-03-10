// 예제 13.13 [streams-to-sequences.8:src/main/java/travelator/analytics/MarketingAnalytics.kt]

private fun <T> averageBy(
  values: Collection<T>,
  selector: (T) -> Int
): Double {
  return values.sumBy(selector) / values.size.toDouble()
}