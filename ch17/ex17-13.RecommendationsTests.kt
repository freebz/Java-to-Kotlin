// 예제 17.13 [mocks-to-maps.3:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private val recommendations =
    Recommendations(
        featuredDestinations::getValue,
        distanceInMetersBetween::getValue
    )