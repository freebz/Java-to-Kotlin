// 예제 13.18 [streams-to-sequences.10:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val eventsForSuccessfulBooking = eventStore
    .queryAsStream("type=CompletedBooking&timerange=$timeRange")
    .flatMap { event ->
        val interactionId = event["interactionId"] as String
        eventStore.queryAsStream("interactionId=$interactionId")
    }