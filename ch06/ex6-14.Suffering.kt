// 예제 6.14 [collections.8:src/main/java/travelator/Suffering.kt]

object Suffering {
    @JvmStatic
    fun sufferScoreFor(route: List<Journey>): Int {
        return sufferScore(
            longestJourneysIn(route, 3),
            Routes.getDepartsFrom(route)
        )
    }

    @JvmStatic
    fun longestJourneysIn(
        journeys: List<Journey>,
        limit: Int
    ): List<Journey> {
        val actualLimit = Math.min(journeys.size, limit)
        return sorted(
            journeys,
            comparing { obj: Journey -> obj.duration }.reversed()
        ).subList(0, actualLimit)
    }

    fun routesToShowFor(itineraryId: String?): List<List<Journey>> {
        return bearable(Other.routesFor(itineraryId))
    }

    private fun bearable(routes: List<List<Journey>>): List<List<Journey>> {
        return routes.stream()
            .filter { route -> sufferScoreFor(route) <= 10 }
            .collect(Collectors.toUnmodifiableList())
    }

    private fun sufferScore(
        longestJourneys: List<Journey>,
        start: location
    ): Int {
        return SOME_COMPLICATED_RESULT()
    }
}