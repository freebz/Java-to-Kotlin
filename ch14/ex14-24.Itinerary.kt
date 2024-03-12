// 예제 14.24 [accumulator.12:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route,
    val accommodations: List<Accommodation> = emptyList()
) {
    ...
    fun costs(): List<Money> = route.costs() + accommodations.costs()
    ...
}

fun Iterable<Accommodation>.costs(): List<Money> = flatMap { it.costs() }