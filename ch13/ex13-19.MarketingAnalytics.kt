// 예제 13.19 [streams-to-sequences.11:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val eventsForSuccessfulBooking = eventStore
    .queryAsStream("type=CompletedBooking&timerange=$timeRange")
    .asSequence()
    .flatMap { event ->
        val interactionId = event["interactionId"] as String
        eventStore
            .queryAsStream("interactionId=$interactionId")
            .asSequence()
    }