// 예제 13.29 [streams-to-sequences.17:src/main/java/travelator/analytics/MarketingAnalytics.kt]

typealias Event = Map<String, Any?>

val Event.interactionId: String? get() =
    this["interactionId"] as? String