// 예제 17.14 [mocks-to-maps.3:src/test/java/travelator/recommendations/RecommendationsTests.kt]

@Test
fun deduplicates_using_smallest_distance() {
    givenFeaturedDestinationsFor(
        alton,
        flowerFarm, watercressLine
    )
    givenFeaturedDestinationsFor(
        froyle,
        flowerFarm, watercressLine
    )
    givenADistanceFrom(alton, flowerFarm, 5300)
    givenADistanceFrom(alton, watercressLine, 320)
    givenADistanceFrom(froyle, flowerFarm, 0)
    givenADistanceFrom(froyle, watercressLine, 6300)
    assertEquals(
        listOf(
            FeaturedDestinationSuggestion(froyle, flowerFarm, 0),
            FeaturedDestinationSuggestion(alton, watercressLine, 320)
        ),
        recommendations.recommendationsFor(setOf(alton, froyle))
    )
}