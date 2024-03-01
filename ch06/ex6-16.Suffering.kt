// 예제 6.16 [collections.8:src/main/java/travelator/Suffering.kt]

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