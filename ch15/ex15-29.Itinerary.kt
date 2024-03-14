// 예제 15.29 [encapsulated-collections.11:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route
) {
    fun hasJourneyLongerThan(duration: Duration) =
        route.any { it.duration > duration }
    ...
}