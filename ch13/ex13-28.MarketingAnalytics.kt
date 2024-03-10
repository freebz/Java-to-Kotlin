// 예제 13.28 [streams-to-sequences.16:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun averageNumberOfEventsPerCompletedBooking(
    timeRange: String
): Double {
    return eventStore
        .queryAsStream("type=CompletedBooking&timerange=$timeRange")
        .allEventsInSameInteractions()
        .groupBy { event ->
            event["interactionId"] as String
        }.values
        .averageBy { it.size }
}

fun Sequence<MutableMap<String, Any?>>.allEventsInSameInteractions() =
    flatMap { event ->
        val interactionId = event["interactionId"] as String
        eventStore
            .queryAsStream("interactionId=$interactionId")
    }