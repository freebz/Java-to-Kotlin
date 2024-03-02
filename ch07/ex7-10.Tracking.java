// 예제 7.10 [actions.4:src/main/java/travelator/Tracking.java]

@Override
public Optional<Trip> currentTripFor(String customerId, Instant at) {
    var candidates = trips.currentTripFor(customerId, at)
        .stream()
        .filter((trip) -> trip.getBookingStatus() == BOOKED)
        .collect(toList());
...
}