// 예제 17.18 [mocks-to-maps.5:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun resultFor(
    featuredDestinations: Map<Location, List<FeaturedDestination>>,
    distances: Map<Pair<Location, Location>, Int>,
    locations: Set<Location>
): List<FeaturedDestinationSuggestion> {
    val subject = subjectFor(featuredDestinations, distances)
    return subject.recommendationsFor(location)
}