// 예제 18.11 [open-to-sealed.6:src/main/java/travelator/itinerary/ItineraryItem.kt]

data class Accomodation(
    ...
) : ItineraryItem() {
    ...
}

val Accommodation.mapOverlay
    get() = PointOverlay(
        id = id,
        position = location.position,
        text = location.userReadableName,
        icon = StandardIcons.HOTEL
    )