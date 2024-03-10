// 예제 13.25 [streams-to-sequences.13:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun averageNumberOfEventsPerCompletedBooking(
    timeRange: String
): Double {
    return eventStore
        .queryAsStream("type=CompletedBooking&timerange=$timeRange")
        .flatMap { event ->
            val interactionId = event["interactionId"] as String
            eventStore
                .queryAsStream("interactionId=$interactionId")
        }.groupBy { event ->
            event["interactionId"] as String
        }.values
        .averageBy { it.size }
}