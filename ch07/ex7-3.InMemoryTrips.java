// 예제 7.3 [actions.0:src/test/java/travelator/InMemoryTrips.java]

public class InMemoryTrips implements Trips {
    ...

    @Override
    public Set<Trip> currentTripsFor(String customerId) {
        return tripsFor(customerId).stream()
                .filter(trip -> trip.isPlannedToBeActiveAt(clock.instant()))
                .collect(toSet());
    }
}