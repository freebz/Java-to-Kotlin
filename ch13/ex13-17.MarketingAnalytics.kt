// 예제 13.17 [streams-to-sequences.10:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val bookingEventsByInteractionId = eventsForSuccessfulBooking
    .asSequence()
    .groupingBy { event ->
        event["interactionId"] as String
    }