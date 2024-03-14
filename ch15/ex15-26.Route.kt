// 예제 15.26 [encapsulated-collections.10:src/main/java/travelator/itinerary/Route.kt]

typealias Route = List<Journey>

val Route.departsFrom: Location
    get() = first().departsFrom

val Route.duration: Duration
    get() = Duration.between(
        first().departureTime,
        last().arrivalTime
    )

... 확장으로 옮겨진 다른 연산