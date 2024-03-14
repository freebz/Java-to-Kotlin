// 예제 15.10 [encapsulated-collections.4:src/main/java/travelator/itinerary/Route.kt]

fun Route.withJourneyAt(index: Int, replacedBy: Journey): Route {
    val newJourneys = ArrayList(journeys)
    newJourneys[index] = replacedBy
    return Route(newJourneys)
}