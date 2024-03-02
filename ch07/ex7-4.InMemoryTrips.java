// 예제 7.4 [actions.1:src/test/java/travelator/InMemoryTrips.java]

@Override
public Set<Trip> currentTripsFor(String customerId) {
    return tripsFor(customerId).stream()
        .filter(trip -> {
            Instant now = clock.instant();
            return trip.isPlannedToBeActiveAt(now);
        })
        .collect(toSet());
}