// 예제 13.7 [streams-to-sequences.3:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val averageNumberOfEventsPerCompletedBooking = bookingEventsByInteractionId
    .values
    .map { it.size }
    .average()
return averageNumberOfEventsPerCompletedBooking