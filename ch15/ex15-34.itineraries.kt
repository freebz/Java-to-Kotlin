// 예제 15.34 [encapsulated-collections.13:src/main/java/travelator/itinerary/itineraries.kt]

fun Itinerary.withoutJourneysBy(travelMethod: TravelMethod) =
    Itinerary(
        id,
        this.filterNot { it.method == travelMethod }
    )