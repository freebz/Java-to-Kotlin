// 예제 15.31 [encapsulated-collections.13:src/main/java/travelator/itinerary/Itinerary.kt]

fun Route.hasJourneyLongerThan(duration: Duration) =
    any { it.duration > duration }