// 예제 15.16 [encapsulated-collections.7:src/main/java/travelator/itinerary/Route.kt]

fun <T> Iterable<T>.withItemAt(index: Int, replacedBy: T): List<T> =
    this.toMutableList().apply {
        this[index] = replacedBy
    }