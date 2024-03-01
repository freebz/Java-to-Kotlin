// 예제 6.17 [collections.9:src/main/java/travelator/Suffering.kt]

@JvmStatic
fun longestJourneysIn(journeys: List<Journey>, limit: Int): List<Journey> =
    journeys.sortedByDescending { it.duration }.take(limit)