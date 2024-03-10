// 예제 13.30 [streams-to-sequences.17:src/main/java/travelator/analytics/MarketingAnalytics.kt]

class MarketingAnalytics(
    private val eventStore: EventStore
) {
    fun averageNumberOfEventsPerCompletedBooking(
        timeRange: String
    ): Double = eventStore
        .queryAsSequence("type=CompletedBooking&timerange=$timeRange")
        .allEventsInSameInteractions()
        .groupBy(Event::interactionId)
        .values
        .averageBy { it.size }
    
    private fun Sequence<Event>.allEventsInSameInteractions() =
        flatMap { event ->
            eventStore.queryAsStream(
                "interactionId=${event.interactionId}"
            )
        }
}

inline fun <T> Collection<T>.averageBy(selector: (T) -> Int): Double =
    sumBy(selector) / size.toDouble()

fun EventStore.queryAsSequence(query: String) =
    this.queryAsStream(query).asSequence()