// 예제 15.37 [encapsulated-collections.15:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route
) : Route by route {
    fun withTransformedRoute(transform: (Route).() -> Route) =
        copy(route = transform(route))
    ...
}