// 예제 7.8 [actions.3:src/main/java/travelator/Trips.java]

public interface Trips {
    ...
    Set<Trip> currentTripsFor(String customerId, Instant at);
}