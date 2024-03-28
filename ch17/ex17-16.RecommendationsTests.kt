// 예제 17.16 [mocks-to-maps.4:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun of(vararg destination: FeaturedDestination)
        = destination.toList()