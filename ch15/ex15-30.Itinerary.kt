// 예제 15.30 [encapsulated-collections.12:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route
) : Route by route {

    fun hasJourneyLongerThan(duration: Duration) =
        any { it.duration > duration }
    
    ...
}