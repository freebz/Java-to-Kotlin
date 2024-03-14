// 예제 15.32 [encapsulated-collections.13:src/main/java/travelator/itinerary/itineraries.kt]

fun Iterable<Itinerary>.shortest() =
    minByOrNull {
        it.duration
    }