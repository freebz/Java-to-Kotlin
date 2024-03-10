// 예제 13.15 [streams-to-sequences.9:src/main/java/travelator/analytics/MarketingAnalytics.kt]

inline fun <T> Collection<T>.averageBy(selector: (T) -> Int): Double =
    sumBy(selector) / size.toDouble()