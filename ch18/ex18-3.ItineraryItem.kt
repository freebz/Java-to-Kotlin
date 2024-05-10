// 예제 18.3 [open-to-sealed.0:src/main/java/travelator/itinerary/ItineraryItem.kt]

interface ItineraryItem {
    val id: Id<ItineraryItem>
    val description: String
    val costs: List<Money>
    val mapOverlay: MapOverlay
    ... 그 외 다른 메서드
}