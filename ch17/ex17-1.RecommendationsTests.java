// 예제 17.1 [interfaces-to-funs.7:src/test/java/travelator/recommendations/RecommendationsTests.java]

public class RecommendationsTests {

    private final DistanceCalculator distanceCalculator =
        mock(DistanceCalculator.class);
    private final FeaturedDestinations featuredDestinations =
        mock(FeaturedDestination.class);
    private final Recommendations recommendations = new Recommendations(
        featuredDestinations::findCloseTo,
        distanceCalculator::distanceInMetersBetween
    );
    ...
}