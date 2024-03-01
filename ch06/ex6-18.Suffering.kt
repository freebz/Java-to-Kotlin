// 예제 6.18 [collections.10:src/main/java/travelator/Suffering.kt]

@JvmStatic
fun List<Journey>.longestJourneys(limit: Int): List<Journey> =
    sortedByDescending { it.duration }.take(limit)