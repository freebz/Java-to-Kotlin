// 예제 17.3 [interfaces-to-funs.7:src/test/java/travelator/recommendations/RecommendationsTests.java]

private void givenADistanceBetween(
    Location location,
    FeaturedDestination destination,
    int result
) {
    when(
        distanceCalculator.distanceInMetersBetween(
            location,
            destination.getLocation())
    ).thenReturn(result);
}