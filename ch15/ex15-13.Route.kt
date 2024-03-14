// 예제 15.13 [encapsulated-collections.6:src/main/java/travelator/itinerary/Route.kt]

class Route(
    private val journeys: List<Journey>
): List<Journey> by journeys