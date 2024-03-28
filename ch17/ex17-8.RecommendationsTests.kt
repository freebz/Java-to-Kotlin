// 예제 17.8 [mocks-to-maps.1:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun givenFeaturedDestinationsFor(
    location: Location,
    destinations: List<FeaturedDestination>
) {
    featuredDestinations[location] = destinations.toList()
}