// 예제 18.12 [open-to-sealed.6:src/main/java/travelator/itinerary/ItineraryItem.kt]

val ItineraryItem.mapOverlay: MapOverlay get() = when (this) {
    is Accommodation -> mapOverlay
    is Attraction -> mapOverlay
    is Journey -> mapOverlay
    is RestaurantBooking -> mapOverlay
}