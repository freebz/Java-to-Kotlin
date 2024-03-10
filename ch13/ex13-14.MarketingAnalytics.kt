// 예제 13.14 [streams-to-sequences.7:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val values = bookingEventsByInteractionId.values
return averageBy<MutableList<MutableMap<String, Any>>>(values) { it. size }