// 예제 13.8 [streams-to-sequences.4:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val values = bookingEventsByInteractionId.values
return values.sumBy { it.size } / values.size.toDouble()