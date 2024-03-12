// 예제 14.2 [accumulator.0:src/main/java/travelator/itinerary/Itinerary.kt]

data class Itinerary(
    val id: Id<Itinerary>,
    val route: Route,
    val accommodations: List<Accommodation> = emptyList()
) {
    ...

    fun addCostsTo(calculator: CostSummaryCalculator) {
        route.addCostsTo(calculator)
        accommodations.addCostsTo(calculator)
    }

    ...
}

fun Iterable<Accommodation>.addCostsTo(calculator: CostSummaryCalculator) {
    forEach { a ->
        a.addCostsTo(calculator)
    }
}