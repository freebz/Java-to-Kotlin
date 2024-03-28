// 예제 17.2 [interfaces-to-funs.7:src/test/java/travelator/recommendations/RecommendationsTests.java]

@Test
public void returns_recommendations_for_single_location() {
    givenFeaturedDestinationsFor(pairs,
        List.of(
            eiffelTower,
            louvre
        ));
    givenADistanceBetween(paris, eiffelTower, 5000);
    givenADistanceBetween(paris, louvre, 1000);

    assertEquals(
        List.of(
            new FeaturedDestinationSuggestion(paris, louvre, 1000),
            new FeaturedDestinationSuggestion(paris, eiffelTower, 5000)
        ),
        recommendations.recommendationsFor(Set.of(paris))
    );
}