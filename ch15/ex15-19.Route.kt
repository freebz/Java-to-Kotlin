// 예제 15.19 [encapsulated-collections.8:src/main/java/travelator/itinerary/Route.kt]

typealias Route = List<Journey>

fun Route(journeys: List<Journey>) = journeys

val Route.journeys get() = this