// 예제 17.19 [mocks-to-maps.5:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun check(
    featuredDestinations: Map<Location, List<FeaturedDestination>>,
    distances: Map<Pair<Location, Location>, Int>,
    recommendations: Set<Location>,
    shouldReturn: List<FeaturedDestinationSuggestion>
) {
    assertEquals(
        shouldReturn,
        resultFor(featuredDestinations, distances, recommendations)
    )
}