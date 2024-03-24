// 예제 16.10 [interfaces-to-funs.5:src/test/java/travelator/recommendations/RecommendationsTests.java]

private final Recommendations recommendations = new Recommendations(
    featuredDestinations,
    distanceCalculator,
    featuredDestinations::findCloseTo
);