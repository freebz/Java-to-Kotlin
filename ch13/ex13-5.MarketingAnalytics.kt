// 예제 13.5 [streams-to-sequences.2:src/main/java/travelator/analytics/MarketingAnalytics.kt]

val eventsForSuccessfulBooking = eventStore
    .queryAsStream("type=CompletedBooking&timerange=$timeRange")
    .flatMap { event ->
        val interactionId = event["interactionId"] as String
        eventStore.queryAsStream("interactionId=$interactionId")
    }
val bookingEventsByInteractionId = eventsForSuccessfulBooking.collect(
    groupingBy { event -> event["interactionId"] as String }
)