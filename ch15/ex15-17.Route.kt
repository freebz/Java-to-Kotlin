// 예제 15.17 [encapsulated-collections.7:src/main/java/travelator/itinerary/Route.kt]

fun Route.withJourneyAt(index: Int, replacedBy: Journey): Route =
    Route(journeys.withItemAt(index, replacedBy))