// 예제 13.23 [streams-to-sequences.12:src/main/java/travelator/analytics/MarketingAnalytics.kt]

fun EventStore.queryAsStream(query: String) =
    this.queryAsStream(query).asSequence()