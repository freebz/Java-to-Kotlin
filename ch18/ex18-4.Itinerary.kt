// 예제 18.4 [open-to-sealed.0:src/main/java/travelator/itinerary/Itinerary.kt]

val Itinerary.mapOverlay
    get() = OverlayGroup(
        id = id,
        elements = items.map { it.mapOverlay })