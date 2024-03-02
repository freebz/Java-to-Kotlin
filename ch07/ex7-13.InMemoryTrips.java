// 예제 7.13 [actions.4:src/test/java/travelator/InMemoryTrips.java]

public class InMemoryTrips implements Trips {
    
    ...
    @Override
    public Set<Trip> currentTripsFor(String customerId, Instant at) {
        var now = clock.instant();
        return tripsFor(customerId).stream()
                .filter(trip -> trip.isPlannedToBeActiveAt(now))
                .collect(toSet());
    }
}