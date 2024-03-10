// 예제 13.10 [streams-to-sequences.5:src/main/java/travelator/analytics/MarketingAnalytics.kt]

private fun averageBy(
  values: MutableCollection<MutableList<MutableMap<String, Any>>>
): Double {
  return values.sumBy { it.size } / values.size.toDouble()
}