// 예제 15.4 [encapsulated-collections.0:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route
) {
    ...
}