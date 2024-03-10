// 예제 13.6 [streams-to-sequences.2:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val averageNumberOfEventsPerCompletedBooking = bookingEventsByInteractionId
    .values
    .stream()
    .mapToInt { it.size }
    .average()
return averageNumberOfEventsPerCompletedBooking.orElse(Double.NaN)