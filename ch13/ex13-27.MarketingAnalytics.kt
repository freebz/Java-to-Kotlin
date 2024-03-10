// 예제 13.27 [streams-to-sequences.15:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun averageNumberOfEventsPerCompletedBooking(
    timeRange: String
): Double {
    return allEventsInSameInteractions(
        eventStore
            .queryAsStream("type=CompletedBooking&timerange=$timeRange")
    )
        .groupBy { event ->
            event["interactionId"] as String
        }.values
        .averageBy { it.size }
}

private fun allEventsInSameInteractions(
    sequence: Sequence<MutableMap<String, Any?>>
) = sequence
    .flatMap { event ->
        val interactionId = event["interactionId"] as String
        eventStore
            .queryAsStream("interactionId=$interactionId")
    }