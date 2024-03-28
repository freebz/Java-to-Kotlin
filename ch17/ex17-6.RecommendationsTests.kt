// 예제 17.6 [mocks-to-maps.0:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun givenFeaturedDestinationsFor(
    location: Location,
    result: List<FeaturedDestination>
) {
    Mockito.`when`(featuredDestinations.findCloseTo(location))
        .thenReturn(result)
}