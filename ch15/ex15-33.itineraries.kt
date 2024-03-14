// 예제 15.33 [encapsulated-collections.13:src/main/java/travelator/itinerary/itineraries.kt]

fun Route.withoutJourneysBy(travelMethod: TravelMethod) =
    this.filterNot { it.method == travelMethod }