// 예제 13.21 [streams-to-sequences.12:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val bookingEventsByInteractionId = eventsForSuccessfulBooking
    .groupingBy { event ->
        event["interactionId"] as String
    }