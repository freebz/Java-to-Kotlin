// 예제 15.14 [encapsulated-collections.5:src/test/java/travelator/itinerary/RouteTests.kt]

@Test
fun replaceJourney() {
    val journey1 = Journey(waterloo, alton, someTime(), someTime(), RAIL)
    val journey2 = Journey(alton, alresford, someTime(), someTime(), CAMEL)
    val journey3 = Journey(alresford, winchester, someTime(), someTime(), BUS)
    val route = Route(listOf(journey1, journey2, journey3))

    val replacement = Journey(alton, alresford, someTime(), someTime(), RAIL)
    val replaced = route.withJourneyAt(1, replacement)

    assertEquals(journey1, replaced.get(0))
    assertEquals(replacement, replaced.get(1))
    assertEquals(journey3, replaced.get(2))
}