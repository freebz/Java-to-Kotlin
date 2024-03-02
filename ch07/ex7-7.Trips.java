// 예제 7.7 [actions.0:src/main/java/travelator/Trips.java]

public interface Trips {
    ...
    Set<Trip> currentTripsFor(String customerId);
}