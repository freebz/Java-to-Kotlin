// 예제 15.23 [encapsulated-collections.9:src/main/java/travelator/itinerary/Route.kt]

val Route.size: Int
    get() = this.size

operator fun Route.get(index: Int) = this[index]