// 예제 7.14 [actions.5:src/test/java/travelator/InMemoryTrips.java]

public class InMemoryTrips implements Trips {
    
    ...
    @Override
    public Set<Trip> currentTripsFor(String customerId, Instant at) {
        return tripsFor(customerId).stream()
                .filter(trip -> trip.isPlannedToBeActiveAt(at))
                .collect(toSet());
    }
}