// 예제 13.24 [streams-to-sequences.12:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun averageNumberOfEventsPerCompletedBooking(
    timeRange: String
): Double {
    val eventsForSuccessfulBooking = eventStore
        .queryAsStream("type=CompletedBooking&timerange=$timeRange")
        .flatMap { event ->
            val interactionId = event["interactionId"] as String
            eventStore
                .queryAsStream("interactionId=$interactionId")
        }
    val bookingEventsByInteractionId = eventsForSuccessfulBooking
        .groupBy { event ->
            event["interactionId"] as String
        }
    return bookingEventsByInteractionId.values.averageBy { it.size }
}