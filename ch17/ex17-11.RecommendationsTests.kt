// 예제 17.11 [mocks-to-maps.2:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun givenADistanceFrom(
    location: Location,
    destination: FeaturedDestination,
    distanceInMeters: Int
) {
    distanceInMetersBetween[location to destination.location] =
        distanceInMeters
}