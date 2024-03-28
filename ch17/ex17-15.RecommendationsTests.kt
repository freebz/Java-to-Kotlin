// 예제 17.15 [mocks-to-maps.4:src/test/java/travelator/recommendations/RecommendationsTests.kt]

@Test
fun deduplicates_using_smallest_distance() {
    givenFeaturedDestinationsFor(alton, of(flowerFarm, watercressLine))
    givenADistanceFrom(alton, to = flowerFarm, of = 5300)
    givenADistanceFrom(alton, to = watercressLine, of = 320)

    givenFeaturedDestinationsFor(froyle, of(flowerFarm, watercressLine))
    givenADistanceFrom(froyle, to = flowerFarm, of = 0)
    givenADistanceFrom(froyle, to = watercressLine, of = 6300)

    assertEquals(
        listOf(
            FeaturedDestinationSuggestion(froyle, flowerFarm, 0),
            FeaturedDestinationSuggestion(alton, watercressLine, 320)
        ),
        recommendations.recommendationsFor(setOf(alton, froyle))
    )
}