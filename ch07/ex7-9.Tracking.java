// 예제 7.9 [actions.3:src/main/java/travelator/Tracking.java]

public class Tracking implements ITrackTrips {
    ...
    
    @Override
    public Optional<Trip> currentTripFor(String customerId) {
        var candidates = trips.currentTripFor(customerId, null)
                .stream()
                .filter((trip) -> trip.getBookingStatus() == BOOKED)
                .collect(toList());
        if (candidates.size() == 1)
            return Optional.of(candidates.get(0));
        else if (candidates.size() == 0)
            return Optional.empty();
        else
            throw new IllegalStateException(
                    "Unexpectedly more than one current trip for " + customerId
            );
    }
}