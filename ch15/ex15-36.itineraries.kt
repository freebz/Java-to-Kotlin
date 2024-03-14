// 예제 15.36 [encapsulated-collections.14:src/main/java/travelator/itinerary/itineraries.kt]

fun Itinerary.withoutJourneysBy(travelMethod: TravelMethod) =
    copy(route = filterNot { it.method == travelMethod } )