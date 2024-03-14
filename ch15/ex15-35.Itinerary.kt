// 예제 15.35 [encapsulated-collections.14:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route
) : Route by route {
    ...
}