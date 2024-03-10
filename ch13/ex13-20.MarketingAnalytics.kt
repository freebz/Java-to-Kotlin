// 예제 13.20 [streams-to-sequences.11:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val bookingEventsByInteractionId = eventsForSuccessfulBooking
    .asSequence()
    .groupingBy { event ->
        event["interactionId"] as String
    }