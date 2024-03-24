// 예제 16.12 [interfaces-to-funs.6:src/test/java/travelator/recommendations/RecommendationsTests.java]

private final Recommendations recommendations = new Recommendations(
    distanceCalculator,
    featuredDestinations::findCloseTo
);