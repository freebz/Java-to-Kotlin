// 예제 15.21 [encapsulated-collections.9:src/test/java/travelator/itinerary/RouteTests.kt]

val route = listOf(journey1, journey2, journey3)
val replacement = Journey(alton, alresford, someTime(), someTime(), RAIL)

assertEquals(
    listOf(journey1, journey2, journey3),
    route.withJourneyAt(1, replacement)
)