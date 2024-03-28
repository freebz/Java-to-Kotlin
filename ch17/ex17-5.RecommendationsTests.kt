// 예제 17.5 [mocks-to-maps.0:src/test/java/travelator/recommendations/RecommendationsTests.kt]

class RecommendationsTests {
    private val distanceCalculator = mock(DistanceCalculator::class.java)
    private val featuredDestinations = mock(FeaturedDestination::class.java)

    private val recommendations = Recommendations(
        featuredDestinations::findCloseTo,
        distanceCalculator::distanceInMetersBetween
    )
    ...