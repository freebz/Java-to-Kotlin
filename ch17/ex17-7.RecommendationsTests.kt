// 예제 17.7 [mocks-to-maps.1:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private val featuredDestinations =
    mutableMapOf<Location, List<FeaturedDestination>()
        .withDefault { emptyList() }