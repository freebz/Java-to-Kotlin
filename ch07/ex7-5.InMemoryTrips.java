// 예제 7.5 [actions.2:src/test/java/travelator/InMemoryTrips.java]

@Override
public Set<Trip> currentTripsFor(String customerId) {
    var now = clock.instant();
    return tripsFor(customerId).stream()
        .filter(trip -> trip.isPlannedToBeActiveAt(now))
        .collect(toSet());
}