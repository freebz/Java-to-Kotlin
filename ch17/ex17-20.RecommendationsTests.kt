// 예제 17.20 [mocks-to-maps.5:src/test/java/travelator/recommendations/RecommendationsTests.kt]

class RecommendationsTests {
    companion object {
        val distances = mapOf(
            (paris to eiffelTower.location) to 5000,
            (paris to louvre.location) to 1000,
            (alton to flowerFarm.location) to 5300,
            (alton to watercressLine.location) to 320,
            (froyle to flowerFarm.location) to 0,
            (froyle to watercressLine.location) to 6300
        )
    }

    ...

    @Test
    fun returns_to_recommendations_when_no_featured() {
        check(
            featuredDestinations = emptyMap(),
            distances = distances,
            recommendations = setOf(paris),
            shouldReturn = emptyList()
        )
    }

    ...

    @Test
    fun returns_recommendations_for_multi_location() {
        check(
            featuredDestinations = mapOf(
                paris to listOf(eiffelTower, louvre),
                alton to listOf(flowerFarm, watercressLine),
            ),
            distances = distances,
            recommendations = setOf(paris, alton),
            shouldReturn = listOf(
                FeaturedDestinationSuggestion(alton, watercressLine, 320),
                FeaturedDestinationSuggestion(paris, louvre, 1000),
                FeaturedDestinationSuggestion(paris, eiffelTower, 5000),
                FeaturedDestinationSuggestion(alton, flowerFarm, 5300)
            )
        )
    }
    ...
}