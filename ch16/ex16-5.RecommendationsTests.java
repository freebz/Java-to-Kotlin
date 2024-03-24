// 예제 16.5 [interfaces-to-funs.0:src/test/java/travelator/recommendations/RecommendationsTests.java]

public class RecommendationsTests {
    private final DistanceCalculator distanceCalculator =
        mock(DistanceCalculator.class);
    private final FeaturedDestinations featuredDestinations =
        mock(FeaturedDestination.class);
    private final Recommendations recommendations = new Recommendations(
        featuredDestinations,
        distanceCalculator
    );
    ...
}