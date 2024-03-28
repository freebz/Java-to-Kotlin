// 예제 17.21 [interfaces-to-funs.0:src/test/java/travelator/recommendations/RecommendationsTests.java]

@Test
public void returns_recommendations_for_multi_location() {
    givenFeaturedDestinationsFor(paris,
        List.of(
            eiffelTower,
            louvre
        ));
    givenADistanceBetween(paris, eiffelTower, 5000);
    givenADistanceBetween(paris, louvre, 1000);

    givenFeaturedDestinationsFor(alton,
        List.of(
            flowerFarm,
            watercressLine
        ));
    givenADistanceBetween(alton, flowerFarm, 5300);
    givenADistanceBetween(alton, watercressLine, 320);

    assertEquals(
        List.of(
            new FeaturedDestinationSuggestion(alton, watercressLine, 320),
            new FeaturedDestinationSuggestion(paris, louvre, 1000),
            new FeaturedDestinationSuggestion(paris, eiffelTower, 5000),
            new FeaturedDestinationSuggestion(alton, flowerFarm, 5300)
        ),
        recommendations.recommendationsFor(Set.of(paris, alton))
    );
}