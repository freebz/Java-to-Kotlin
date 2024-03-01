// 예제 6.19 [collections.10:src/main/java/travelator/Suffering.kt]

@JvmStatic
fun sufferScoreFor(route: List<Journey>): Int {
    return sufferScore(
        route.longestJourneys(limit = 3),
        Routes.getDepartsFrom(route)
    )
}