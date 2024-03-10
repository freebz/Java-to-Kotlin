// 예제 13.26 [streams-to-sequences.14:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun averageNumberOfEventsPerCompletedBooking(
    timeRange: String
): Double {
    return allEventsInSameInteractions(timeRange)
        .groupBy { event ->
            event["interactionId"] as String
        }.values
        .averageBy { it.size }
}

private fun allEventsInSameInteractions(timeRange: String) = eventStore
    .queryAsStream("type=CompletedBooking&timerange=$timeRange")
    .flatMap { event ->
        val interactionId = event["interactionId"] as String
        eventStore
            .queryAsStream("interactionId=$interactionId")
    }