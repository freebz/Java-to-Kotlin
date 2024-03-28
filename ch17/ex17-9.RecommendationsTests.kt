// 예제 17.9 [mocks-to-maps.1:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private val recommendations =
    Recommendations(
        featuredDestinations::getValue,
        distanceCalculator::distanceInMetersBetween
    )