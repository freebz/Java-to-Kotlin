// 예제 18.14 [open-to-sealed.8:src/main/java/travelator/itinerary/ItineraryDescription.kt]

val ItineraryItem.description: String
    get() = when (this) {
        is Accommodation ->
            "$nights nights at ${location.userReadableName}"
        is Attraction ->
            location.userReadableName
        is Journey ->
            "${departsFrom.userReadableName} " +
                    "to ${arrivesAt.userReadableName}" +
                    "by ${travelMethod.userReadableName}"
        is RestaurantBooking -> location.userReadableName
    }