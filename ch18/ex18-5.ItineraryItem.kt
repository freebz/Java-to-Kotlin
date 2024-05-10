// 예제 18.5 [open-to-sealed.0:src/main/java/travelator/itinerary/ItineraryItem.kt]

if (item instanceof Journey) {
    var journey = (Journey) item;
    return ...
} else if (item instanceof Accomodation) {
    var accomodation = (Accomodation) item;
    return ...
} else if (item instanceof RestaurantBooking) {
    var restaurant = (RestaurantBooking) item;
    return ...
} else {
    throw new IllegalStateException("should never happen")
}