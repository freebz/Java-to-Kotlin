// 예제 15.18 [encapsulated-collections.6:src/main/java/travelator/itinerary/Route.kt]

class Route(
    val journeys: List<Journey>
) : List<Journey> by journeys