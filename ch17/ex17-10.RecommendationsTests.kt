// 예제 17.10 [mocks-to-maps.2:src/test/java/travelator/recommendations/RecommendationsTests.kt]

class RecommendationsTests {
    private val distanceCalculator =
        mutableMapOf<Location, List<FeaturedDestination>>()
            .withDefault { emptyList() }
    private val distanceInMetersBetween =
        mutableMapOf<Pair<Location, Location>, Int>()
            .withDefault { -1 }
    private val recommendations =
        Recommendations(
            featuredDestinations::getValue,
            { l1, l2 -> distanceInMetersBetween.getValue(l1 to l2) }
        )
    ...
}