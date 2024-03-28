// 예제 17.17 [mocks-to-maps.5:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun subjectFor(
    featuredDestinations: Map<Location, List<FeaturedDestination>>,
    distances: Map<Pair<Location, Location>, Int>
): Recommendations {
    val destinationsLookup = featuredDestinations.withDefault { emptyList() }
    val distanceLookup = distances.withDefault { -1 }
    return Recommendations(destinationsLookup::getValue, distanceLookup::getValue)
}