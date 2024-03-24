// 예제 16.14 [interfaces-to-funs.7:src/test/java/travelator/recommendations/RecommendationsTests.java]

private final Recommendations recommendations = new Recommendations(
    featuredDestinations::findCloseTo,
    distanceCalculator::distanceInMetersBetween
);