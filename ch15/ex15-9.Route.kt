// 예제 15.9 [encapsulated-collections.3:src/main/java/travelator/itinerary/Route.kt]

fun withJourneyAt(index: Int, replacedBy: Journey): Route {
    val newJourneys = ArrayList(journeys)
    newJourneys[index] = replacedBy
    return Route(newJourneys)
}