// 예제 18.10 [open-to-sealed.5:src/main/java/travelator/itinerary/ItineraryItem.kt]

data class Accomodation(
    ...
) : ItineraryItem() {
    ...
    val mapOverlay
        get() = PointOverlay(
            id = id,
            position = location.position,
            text = location.userReadableName,
            icon = StandardIcons.HOTEL
        )
    ...