// 예제 15.38 [encapsulated-collections.15:src/main/java/travelator/itinerary/itineraries.kt]

fun Itinerary.withoutJourneysBy(travelMethod: TravelMethod) =
    withTransformedRoute {
        filterNot { it.method == travelMethod }
    }

fun Itinerary.withoutLastJourney() =
    withTransformedRoute { dropLast(1) }