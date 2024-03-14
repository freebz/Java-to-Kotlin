// 예제 15.7 [encapsulated-collections.3:src/main/java/travelator/itinerary/Route.kt]

val Route.departsFrom: Location
    get() = get(0).departsFrom