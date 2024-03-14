// 예제 15.12 [encapsulated-collections.5:src/main/java/travelator/itinerary/Route.kt]

class Route(
    private val journeys: List<Journey>
)

val Route.size: Int
    get() = journeys.size

operator fun Route.get(index: Int) = journeys[index]

...