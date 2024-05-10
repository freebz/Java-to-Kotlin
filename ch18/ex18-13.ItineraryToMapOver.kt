// 예제 18.13 [open-to-sealed.7:src/main/java/travelator/geo/ItineraryToMapOver.kt]

package travelator.geo
import travelator.itinerary.*

val ItineraryItem.mapOverlay: MapOverlay get() = when (this) {
    is Accommodation -> mapOverlay
    is Attraction -> mapOverlay
    is Journey -> mapOverlay
    is RestaurantBooking -> mapOverlay
}

private val Accommodation.mapOverlay
    get() = PointOverlay(
        id = id,
        position = location.position,
        text = location.userReadableName,
        icon = StandardIcons.HOTEL
    )

... Attraction.mapOverlay 등