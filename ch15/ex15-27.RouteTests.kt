// 예제 15.27 [encapsulated-collections.10:src/test/java/travelator/itinerary/RouteTests.kt]

val route = listOf(journey1, journey2, journey3)
assertEquals(
    listOf(journey1, journey2, journey3),
    route.withItemAt(1, replacement)
)