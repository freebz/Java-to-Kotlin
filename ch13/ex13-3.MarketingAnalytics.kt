// 예제 13.3 [streams-to-sequences.1:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun averageNumberOfEventsPerCompletedBooking(
    timeRange: String
): Double {
    val eventsForSuccessfulBooking = eventStore
        .queryAsStream("type=CompletedBooking&timerange=$timeRange")
        .flatMap { event: Map<String?, Any?> ->
            val interactionId = event["interactionId"] as String?
            eventStore.queryAsStream("interactionId=$interactionId")
        }
    val bookingEventsByInteractionId = eventsForSuccessfulBooking.collect(
        Collectors.groupingBy(
            Function { event: Map<String, Any> -> 
                event["interactionId"] as String?
            }
        )
    )
    val averageNumberOfEventsPerCompletedBooking = bookingEventsByInteractionId
        .values
        .stream()
        .mapToInt{ obj: List<Map<String, Any>> -> obj.size }
        .average()
    return averageNumberOfEventsPerCompletedBooking.orElse(Double.NaN)
}