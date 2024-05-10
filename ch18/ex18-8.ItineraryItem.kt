// 예제 18.8 [open-to-sealed.4:src/main/java/travelator/itinerary/ItineraryItem.kt]

sealed class ItineraryItem {
    abstract val id: Id<ItineraryItem>
    abstract val description: String
    abstract val costs: List<Money>
    ... 그 외 다른 메서드
}

val ItineraryItem.mapOverlay: MapOverlay
    get() = TODO("Not yet implemented")

data class Accomodation(
    override val id: Id<Accomodation>,
    val location: Location,
    val checkInFrom: ZonedDateTime,
    val checkOutBefore: ZonedDateTime,
    val pricePerNight: Money
) : ItineraryItem() {
    val nights = Period.between(
        checkInFrom.toLocalDate(),
        checkOutBefore.toLocalDate()
    ).days
    val totalPrice: Money = pricePerNight * nights
    
    override val description
        get() = "$nights nights at ${location.userReadableName}"
    override val costs
        get() = listOf(totalPrice)
    override val mapOverlay
        get() = PointOverlay(
            id = id,
            position = location.position,
            text = location.userReadableName,
            icon = StandardIcons.HOTEL
        )
    ... 그 외 다른 메서드
}