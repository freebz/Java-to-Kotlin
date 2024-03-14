// 예제 15.6 [encapsulated-collections.2:src/main/java/travelator/itinerary/Route.kt]

class Route(
    private val journeys: List<Journey>
) {
    fun size(): Int = journeys.size

    operator fun get(index: Int) = journeys[index]

    val departsFrom: Location
        get() = get(0).departsFrom

    ... 여러 가지 메서드
}